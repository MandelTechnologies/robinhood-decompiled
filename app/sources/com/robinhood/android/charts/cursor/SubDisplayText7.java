package com.robinhood.android.charts.cursor;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubDisplayText.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.cursor.SubDisplayTextKt$toBentoIcons$iconSuffixMap$5, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class SubDisplayText7 extends FunctionReferenceImpl implements Function1<ServerToBentoAssetMapper2, BentoIcon4.Size40> {
    public static final SubDisplayText7 INSTANCE = new SubDisplayText7();

    SubDisplayText7() {
        super(1, BentoIcon4.Size40.class, "<init>", "<init>(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final BentoIcon4.Size40 invoke(ServerToBentoAssetMapper2 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new BentoIcon4.Size40(p0);
    }
}
