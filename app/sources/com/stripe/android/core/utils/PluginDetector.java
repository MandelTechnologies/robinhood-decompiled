package com.stripe.android.core.utils;

import android.util.Log;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PluginDetector.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/core/utils/PluginDetector;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "pluginType", "getPluginType", "()Ljava/lang/String;", "isPlugin", "", "className", "PluginType", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PluginDetector {
    public static final PluginDetector INSTANCE = new PluginDetector();
    private static final String TAG = PluginDetector.class.getSimpleName();
    private static final String pluginType;

    private PluginDetector() {
    }

    static {
        PluginType next;
        Iterator<PluginType> it = PluginType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (INSTANCE.isPlugin(next.getClassName())) {
                    break;
                }
            }
        }
        PluginType pluginType2 = next;
        pluginType = pluginType2 != null ? pluginType2.getPluginName() : null;
    }

    public final String getPluginType() {
        return pluginType;
    }

    private final boolean isPlugin(String className) throws ClassNotFoundException {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            Log.d(TAG, className + " not found: " + e);
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PluginDetector.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/core/utils/PluginDetector$PluginType;", "", "className", "", "pluginName", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "getPluginName", "ReactNative", "Flutter", "Cordova", "Unity", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class PluginType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PluginType[] $VALUES;
        private final String className;
        private final String pluginName;
        public static final PluginType ReactNative = new PluginType("ReactNative", 0, "com.facebook.react.bridge.NativeModule", "react-native");
        public static final PluginType Flutter = new PluginType("Flutter", 1, "io.flutter.embedding.engine.FlutterEngine", "flutter");
        public static final PluginType Cordova = new PluginType("Cordova", 2, "org.apache.cordova.CordovaActivity", "cordova");
        public static final PluginType Unity = new PluginType("Unity", 3, "com.unity3d.player.UnityPlayerActivity", "unity");

        private static final /* synthetic */ PluginType[] $values() {
            return new PluginType[]{ReactNative, Flutter, Cordova, Unity};
        }

        public static EnumEntries<PluginType> getEntries() {
            return $ENTRIES;
        }

        public static PluginType valueOf(String str) {
            return (PluginType) Enum.valueOf(PluginType.class, str);
        }

        public static PluginType[] values() {
            return (PluginType[]) $VALUES.clone();
        }

        private PluginType(String str, int i, String str2, String str3) {
            this.className = str2;
            this.pluginName = str3;
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getPluginName() {
            return this.pluginName;
        }

        static {
            PluginType[] pluginTypeArr$values = $values();
            $VALUES = pluginTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(pluginTypeArr$values);
        }
    }
}
