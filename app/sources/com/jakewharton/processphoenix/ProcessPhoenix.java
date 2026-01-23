package com.jakewharton.processphoenix;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.List;

/* loaded from: classes27.dex */
public final class ProcessPhoenix {
    public static boolean isPhoenixProcess(Context context) {
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid && runningAppProcessInfo.processName.endsWith(":phoenix")) {
                return true;
            }
        }
        return false;
    }
}
