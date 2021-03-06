package Saual60h;
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
//
//                    Source Code Generated by
//                            CA Gen r8
//
//           Copyright (c) 2012 CA. All rights reserved.
//
//    Name: SAUAL50S_IA                      Date: 2012/05/15
//    User: Tanderw                          Time: 13:49:48
//
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
// Import Statements
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;
import java.sql.*;
import com.ca.gen80.vwrt.*;
import com.ca.gen80.vwrt.types.*;
import com.ca.gen80.vwrt.vdf.*;
import com.ca.gen80.csu.exception.*;

// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
// START OF IMPORT VIEW
// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
/**
 * Internal data view storage for: SAUAL50S_IA
 **/
public class SAUAL50S_IA extends ViewBase implements IImportView, Serializable
{
  static VDF localVdf = null;
  
  // Entity View: IN
  //        Type: WS_STUDENT_ANNUAL_RECORD
  /**
   * Attribute missing flag for: InWsStudentAnnualRecordMkAcademicYear
   **/
  public char InWsStudentAnnualRecordMkAcademicYear_AS;
  /**
   * Attribute for: InWsStudentAnnualRecordMkAcademicYear
   **/
  public short InWsStudentAnnualRecordMkAcademicYear;
  // Entity View: IN
  //        Type: WS_STUDENT_STUDY_UNIT
  /**
   * Attribute missing flag for: InWsStudentStudyUnitMkStudyUnitCode
   **/
  public char InWsStudentStudyUnitMkStudyUnitCode_AS;
  /**
   * Attribute for: InWsStudentStudyUnitMkStudyUnitCode
   **/
  public String InWsStudentStudyUnitMkStudyUnitCode;
  /**
   * Attribute missing flag for: InWsStudentStudyUnitSemesterPeriod
   **/
  public char InWsStudentStudyUnitSemesterPeriod_AS;
  /**
   * Attribute for: InWsStudentStudyUnitSemesterPeriod
   **/
  public short InWsStudentStudyUnitSemesterPeriod;
  /**
   * Default Constructor
   **/
  
  public SAUAL50S_IA()
  {
    reset();
  }
  /**
   * Copy Constructor
   **/
  
  public SAUAL50S_IA(SAUAL50S_IA orig)
  {
    copyFrom(orig);
  }
  /**
   * Static instance creator function
   **/
  
  public static SAUAL50S_IA getInstance()
  {
    return new SAUAL50S_IA();
  }
  /**
   * Static free instance method
   **/
  
  public void freeInstance()
  {
  }
  /**
   * clone constructor
   **/
  
  @Override public Object clone()
  	throws CloneNotSupportedException
  {
    return(new SAUAL50S_IA(this));
  }
  /**
   * Resets all properties to the defaults.
   **/
  
  public void reset()
  {
    InWsStudentAnnualRecordMkAcademicYear_AS = ' ';
    InWsStudentAnnualRecordMkAcademicYear = 0;
    InWsStudentStudyUnitMkStudyUnitCode_AS = ' ';
    InWsStudentStudyUnitMkStudyUnitCode = "       ";
    InWsStudentStudyUnitSemesterPeriod_AS = ' ';
    InWsStudentStudyUnitSemesterPeriod = 0;
  }
  /**
   * Gets the VDF array for the instance, initialized.
   **/
  
  public static VDF getViewDefinition()
  {
    if ( localVdf == null )
    {
      VDFEntry [] vdfEntries = {
        new VDFEntry((int)1, "", "InWsStudentAnnualRecord", 
          "WsStudentAnnualRecord", "MkAcademicYear", VDFEntry.TYPE_SHORT, (
          short)1, (short)0, 2, (short)0, null), 
new VDFEntry((int)2, "", "InWsStudentStudyUnit", "WsStudentStudyUnit", 
          "MkStudyUnitCode", VDFEntry.TYPE_STRING, (short)1, (short)0, 7, (
          short)0, null), 
new VDFEntry((int)3, "", "InWsStudentStudyUnit", "WsStudentStudyUnit", 
          "SemesterPeriod", VDFEntry.TYPE_SHORT, (short)1, (short)0, 2, (short)
          0, null), 
      };
      localVdf = new VDF(vdfEntries);
    }
    try {
      VDF result = (VDF)localVdf.clone();
      result.initViewData();
      return result;
    } catch( CloneNotSupportedException e ) {
      return null;
    }
  }
  
  /**
   * Gets the VDF version of the current state of the instance.
   **/
  public VDF getVDF()
  {
    VDF vdf = getViewDefinition();
    // predicate view item
    vdf.getEntries()[0].getDataValue().setObject(new Short(
      InWsStudentAnnualRecordMkAcademicYear));
    // predicate view item
    vdf.getEntries()[1].getDataValue().setObject(
      InWsStudentStudyUnitMkStudyUnitCode);
    // predicate view item
    vdf.getEntries()[2].getDataValue().setObject(new Short(
      InWsStudentStudyUnitSemesterPeriod));
    return(vdf);
  }
  
  /**
   * Sets the current state of the instance to the VDF version.
   **/
  public void setFromVDF(VDF vdf)
  {
    // predicate view item
    if ( vdf.getEntries()[0].getDataValue().getObject() != null )
    {
      InWsStudentAnnualRecordMkAcademicYear = ((Short)vdf.getEntries()[0]
        .getDataValue().getObject()).shortValue();
    }
    else 
    {
      InWsStudentAnnualRecordMkAcademicYear = 0;
    }
    // predicate view item
    if ( vdf.getEntries()[1].getDataValue().getObject() != null )
    {
      InWsStudentStudyUnitMkStudyUnitCode = ((String)vdf.getEntries()[1]
        .getDataValue().getObject());
    }
    else 
    {
      InWsStudentStudyUnitMkStudyUnitCode = "       ";
    }
    // predicate view item
    if ( vdf.getEntries()[2].getDataValue().getObject() != null )
    {
      InWsStudentStudyUnitSemesterPeriod = ((Short)vdf.getEntries()[2]
        .getDataValue().getObject()).shortValue();
    }
    else 
    {
      InWsStudentStudyUnitSemesterPeriod = 0;
    }
  }
  
  /**
   * Sets the current instance based on the passed view.
   **/
  public void copyFrom(IImportView orig)
  {
    this.copyFrom((SAUAL50S_IA) orig);
  }
  
  /**
   * Sets the current instance based on the passed view.
   **/
  public void copyFrom(SAUAL50S_IA orig)
  {
    InWsStudentAnnualRecordMkAcademicYear_AS = 
      orig.InWsStudentAnnualRecordMkAcademicYear_AS;
    InWsStudentAnnualRecordMkAcademicYear = 
      orig.InWsStudentAnnualRecordMkAcademicYear;
    InWsStudentStudyUnitMkStudyUnitCode_AS = 
      orig.InWsStudentStudyUnitMkStudyUnitCode_AS;
    InWsStudentStudyUnitMkStudyUnitCode = 
      orig.InWsStudentStudyUnitMkStudyUnitCode;
    InWsStudentStudyUnitSemesterPeriod_AS = 
      orig.InWsStudentStudyUnitSemesterPeriod_AS;
    InWsStudentStudyUnitSemesterPeriod = 
      orig.InWsStudentStudyUnitSemesterPeriod;
  }
}
