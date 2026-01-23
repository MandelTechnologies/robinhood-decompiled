package com.robinhood.android.transfers.p271ui.max.i18n;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.utils.money.Currencies;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$continueSelected$1$2", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$continueSelected$1$2, reason: use source file name */
/* loaded from: classes9.dex */
final class InternationalTransferDuxo3 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternationalTransferDuxo this$0;

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$continueSelected$1$2$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternationalTransferDuxo3(InternationalTransferDuxo internationalTransferDuxo, Continuation<? super InternationalTransferDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = internationalTransferDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternationalTransferDuxo3 internationalTransferDuxo3 = new InternationalTransferDuxo3(this.this$0, continuation);
        internationalTransferDuxo3.L$0 = obj;
        return internationalTransferDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
        return ((InternationalTransferDuxo3) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InternationalTransferDataState internationalTransferDataState = (InternationalTransferDataState) this.L$0;
        int i = WhenMappings.$EnumSwitchMapping$0[internationalTransferDataState.getTransferDirection().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Currency currency = internationalTransferDataState.getAmount().getCurrency();
            CountryCode.Supported locality = internationalTransferDataState.getLocality();
            Currency localCurrency = locality != null ? Locality2.getLocalCurrency(locality) : null;
            if (localCurrency == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (Intrinsics.areEqual(currency, localCurrency)) {
                this.this$0.currencySwitcherSelected();
            }
        } else if (Intrinsics.areEqual(internationalTransferDataState.getAmount().getCurrency(), Currencies.USD)) {
            this.this$0.currencySwitcherSelected();
        }
        return InternationalTransferDataState.copy$default(internationalTransferDataState, null, null, null, null, null, false, TransferMode.REVIEW, false, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, 8388383, null);
    }
}
