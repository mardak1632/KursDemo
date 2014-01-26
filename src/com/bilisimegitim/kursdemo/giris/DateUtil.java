/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilisimegitim.kursdemo.giris;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AUTODESK
 */
public class DateUtil {
    public static String dateToStr(Date date, String format){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
    public static double bilesikFaizHesapla(double anaPara, int ay){
        return 0;
    }
}
