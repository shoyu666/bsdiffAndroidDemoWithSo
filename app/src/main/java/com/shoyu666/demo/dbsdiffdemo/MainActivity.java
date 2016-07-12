package com.shoyu666.demo.dbsdiffdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;

import com.shoyu666.util.bsdiff.BsPatch;

import java.io.File;

/**
 * Created by shoyu666 on 16/7/11.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BsPatch.test();
        String path = Environment.getExternalStorageDirectory().getAbsolutePath()+ File.separator;
        File old = new File(path,"/Download/patchtest/old.apk");
        File patch = new File(path,"/Download/patchtest/apkpatch.apk");
        File newapk = new File(path,"/Download/patchtest/mynewaaaaa.apk");
        BsPatch.patchSync(old,patch,newapk);
    }
}
