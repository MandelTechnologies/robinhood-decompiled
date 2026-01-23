package com.robinhood.shared.crypto.chips;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoChipsComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/chips/CryptoChipsPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/chips/CryptoChip;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/shared/crypto/chips/CryptoChip$Loaded;", "getValues", "()Lkotlin/sequences/Sequence;", "lib-crypto-chips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.chips.CryptoChipsPreviewParameterProvider, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoChipsComposable5 implements PreviewParameterProvider<ImmutableList<? extends CryptoChipsComposable>> {
    private final Sequence<ImmutableList3<CryptoChipsComposable.Loaded>> values = SequencesKt.sequenceOf(extensions2.toPersistentList(CollectionsKt.listOf((Object[]) new CryptoChipsComposable.Loaded[]{new CryptoChipsComposable.Loaded(null, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, "-18.90%", null, "$3.4B MCap", true), new CryptoChipsComposable.Loaded(null, "ETH", "-3%", null, "$1.3B MCap", true), new CryptoChipsComposable.Loaded(null, "JUP", "+1.5%", null, null, true, 16, null)})));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<ImmutableList<? extends CryptoChipsComposable>> getValues() {
        return this.values;
    }
}
