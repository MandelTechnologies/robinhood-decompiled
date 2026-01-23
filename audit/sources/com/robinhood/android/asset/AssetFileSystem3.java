package com.robinhood.android.asset;

import android.content.res.AssetManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;

/* compiled from: AssetFileSystem.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"asFileSystem", "Lokio/FileSystem;", "Landroid/content/res/AssetManager;", "lib-assets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.asset.AssetFileSystemKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetFileSystem3 {
    public static final FileSystem asFileSystem(AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "<this>");
        return new AssetFileSystem(assetManager);
    }
}
