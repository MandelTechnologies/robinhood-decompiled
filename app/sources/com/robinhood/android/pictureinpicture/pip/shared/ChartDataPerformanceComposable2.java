package com.robinhood.android.pictureinpicture.pip.shared;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChartDataPerformanceComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pictureinpicture.pip.shared.ChartDataPerformanceComposableKt$PercentageChangeRow$1$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class ChartDataPerformanceComposable2 extends FunctionReferenceImpl implements Function1<ServerToBentoAssetMapper2, BentoIcon4.Size16> {
    public static final ChartDataPerformanceComposable2 INSTANCE = new ChartDataPerformanceComposable2();

    ChartDataPerformanceComposable2() {
        super(1, BentoIcon4.Size16.class, "<init>", "<init>(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final BentoIcon4.Size16 invoke(ServerToBentoAssetMapper2 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new BentoIcon4.Size16(p0);
    }
}
