package com.plaid.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;

@Deprecated
/* renamed from: com.plaid.internal.B5 */
/* loaded from: classes16.dex */
public final class C5807B5 {

    /* renamed from: b */
    public static final a f1277b = new a();

    /* renamed from: c */
    public static volatile C5807B5 f1278c;

    /* renamed from: a */
    public final Context f1279a;

    @SourceDebugExtension
    /* renamed from: com.plaid.internal.B5$a */
    public static final class a {
    }

    public C5807B5(Context app) {
        Intrinsics.checkNotNullParameter(app, "app");
        this.f1279a = app.getApplicationContext();
    }

    /* renamed from: a */
    public final void m1154a(String fileName, String data) throws IOException {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(data, "data");
        File parentDirectory = this.f1279a.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(parentDirectory, "getFilesDir(...)");
        Intrinsics.checkNotNullParameter(parentDirectory, "parentDirectory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        } else {
            file.createNewFile();
        }
        FilesKt.writeText$default(file, data, null, 2, null);
    }

    /* renamed from: a */
    public final void m1153a() {
        Intrinsics.checkNotNullParameter("plaid_link_state", "fileName");
        File file = new File(this.f1279a.getFilesDir().toString(), "plaid_link_state");
        if (file.exists()) {
            file.delete();
        }
    }
}
