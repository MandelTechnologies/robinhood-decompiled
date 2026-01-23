package com.robinhood.android.crypto.costbasis.hub;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoCostBasisHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$load$2$1", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$load$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoCostBasisHubDuxo2 extends ContinuationImpl7 implements Function2<CryptoCostBasisHubDataState, Continuation<? super CryptoCostBasisHubDataState>, Object> {
    final /* synthetic */ CryptoCostBasisHubSection $section;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: CryptoCostBasisHubDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$load$2$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoCostBasisHubSection.values().length];
            try {
                iArr[CryptoCostBasisHubSection.SOLD_IN_2025.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoCostBasisHubSection.MISSING_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoCostBasisHubSection.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCostBasisHubDuxo2(CryptoCostBasisHubSection cryptoCostBasisHubSection, Continuation<? super CryptoCostBasisHubDuxo2> continuation) {
        super(2, continuation);
        this.$section = cryptoCostBasisHubSection;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoCostBasisHubDuxo2 cryptoCostBasisHubDuxo2 = new CryptoCostBasisHubDuxo2(this.$section, continuation);
        cryptoCostBasisHubDuxo2.L$0 = obj;
        return cryptoCostBasisHubDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoCostBasisHubDataState cryptoCostBasisHubDataState, Continuation<? super CryptoCostBasisHubDataState> continuation) {
        return ((CryptoCostBasisHubDuxo2) create(cryptoCostBasisHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoCostBasisHubDataState cryptoCostBasisHubDataState = (CryptoCostBasisHubDataState) this.L$0;
        int i = WhenMappings.$EnumSwitchMapping$0[this.$section.ordinal()];
        if (i == 1) {
            return CryptoCostBasisHubDataState.copy$default(cryptoCostBasisHubDataState, CryptoCostBasisHubSectionDataState.copy$default(cryptoCostBasisHubDataState.getSection2025Sold(), null, null, null, true, null, null, null, 119, null), null, null, 6, null);
        }
        if (i == 2) {
            return CryptoCostBasisHubDataState.copy$default(cryptoCostBasisHubDataState, null, CryptoCostBasisHubSectionDataState.copy$default(cryptoCostBasisHubDataState.getSectionMissingDetails(), null, null, null, true, null, null, null, 119, null), null, 5, null);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return CryptoCostBasisHubDataState.copy$default(cryptoCostBasisHubDataState, null, null, CryptoCostBasisHubSectionDataState.copy$default(cryptoCostBasisHubDataState.getSectionConfirmed(), null, null, null, true, null, null, null, 119, null), 3, null);
    }
}
