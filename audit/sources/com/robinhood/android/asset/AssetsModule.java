package com.robinhood.android.asset;

import android.content.res.AssetManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;

/* compiled from: AssetsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/asset/AssetsModule;", "", "<init>", "()V", "provideAssetFileSystem", "Lokio/FileSystem;", "assetManager", "Landroid/content/res/AssetManager;", "lib-assets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AssetsModule {
    public static final AssetsModule INSTANCE = new AssetsModule();

    private AssetsModule() {
    }

    @Assets
    public final FileSystem provideAssetFileSystem(AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        return AssetFileSystem3.asFileSystem(assetManager);
    }
}
