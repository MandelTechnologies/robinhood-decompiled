package com.robinhood.android.equityscreener.table.data;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CellClasses.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/data/ScreenerDataDisplayCell;", "Lcom/robinhood/android/equityscreener/table/data/ScreenerCell;", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getIconAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.table.data.ScreenerDataDisplayCell, reason: use source file name */
/* loaded from: classes3.dex */
public final class CellClasses2 implements CellClasses {
    public static final int $stable = 0;
    private final ServerToBentoAssetMapper2 iconAsset;

    public CellClasses2(ServerToBentoAssetMapper2 iconAsset) {
        Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
        this.iconAsset = iconAsset;
    }

    public final ServerToBentoAssetMapper2 getIconAsset() {
        return this.iconAsset;
    }
}
