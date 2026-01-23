package com.robinhood.android.crypto.gifting.details;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.crypto.gifting.details.utils.CryptoGiftDetailsExtensions;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.models.p355ui.bonfire.cryptogifting.CryptoGiftDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoGiftDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoGiftDetailsDuxo extends OldBaseDuxo<CryptoGiftDetailsViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoGiftDetailsDuxo(SavedStateHandle savedStateHandle) {
        super(CryptoGiftDetailsExtensions.toViewState((CryptoGiftDetails) INSTANCE.getArgs(savedStateHandle)), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: CryptoGiftDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsDuxo;", "Lcom/robinhood/models/ui/bonfire/cryptogifting/CryptoGiftDetails;", "<init>", "()V", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoGiftDetailsDuxo, CryptoGiftDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoGiftDetails getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoGiftDetails) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoGiftDetails getArgs(CryptoGiftDetailsDuxo cryptoGiftDetailsDuxo) {
            return (CryptoGiftDetails) DuxoCompanion.DefaultImpls.getArgs(this, cryptoGiftDetailsDuxo);
        }
    }
}
