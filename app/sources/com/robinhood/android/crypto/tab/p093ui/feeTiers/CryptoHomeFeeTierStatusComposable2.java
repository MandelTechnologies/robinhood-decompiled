package com.robinhood.android.crypto.tab.p093ui.feeTiers;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.rosetta.eventlogging.CryptoFeeTierStatusContext;
import com.robinhood.shared.crypto.p375ui.feeTiers.CryptoFeeTierSummary;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: CryptoHomeFeeTierStatusComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/PreviewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusPreviewParameterProvider, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeFeeTierStatusComposable2 implements PreviewParameterProvider<PreviewState> {
    public static final int $stable = 8;
    private final Sequence<PreviewState> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public CryptoHomeFeeTierStatusComposable2() {
        PreviewState previewState = new PreviewState(new CryptoFeeTierSummary.LowestFee("0.10%", new CryptoFeeTierStatusContext(0.0d, 0.0d, 0.0d, 0.0d, null, 31, null)), null);
        StringResource.Companion companion = StringResource.INSTANCE;
        this.values = SequencesKt.sequenceOf(previewState, new PreviewState(new CryptoFeeTierSummary.HasNextTier(new CryptoFeeTierSummary.HasNextTier.FeeTier("0.20%", "$1,000.00", companion.invoke("current tier - description")), new CryptoFeeTierSummary.HasNextTier.FeeTier("0.10%", "$4,999,000.00", companion.invoke("next tier - description")), new CryptoFeeTierStatusContext(0.0d, 0.0d, 0.0d, 0.0d, null, 31, null)), null), new PreviewState(new CryptoFeeTierSummary.LowestFee("0.10%", new CryptoFeeTierStatusContext(0.0d, 0.0d, 0.0d, 0.0d, null, 31, null)), companion.invoke("expirationBannerText")));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<PreviewState> getValues() {
        return this.values;
    }
}
