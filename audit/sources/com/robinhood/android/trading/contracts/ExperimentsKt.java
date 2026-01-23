package com.robinhood.android.trading.contracts;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Experiments.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0002¨\u0006\u0005"}, m3636d2 = {"isShortingEnabled", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "cancelNewOverride", "contracts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ExperimentsKt {
    public static /* synthetic */ Flow isShortingEnabled$default(ExperimentsStore experimentsStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return isShortingEnabled(experimentsStore, z);
    }

    public static final Flow<Boolean> isShortingEnabled(ExperimentsStore experimentsStore, boolean z) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<this>");
        return FlowKt.combine(ExperimentsProvider.DefaultImpls.streamStateFlow$default(experimentsStore, new Experiment[]{EquitiesSubzero.INSTANCE}, false, null, 6, null), ExperimentsProvider.DefaultImpls.streamStateFlow$default(experimentsStore, new Experiment[]{EquitiesSubzeroCancelNew.INSTANCE}, false, null, 6, null), new C299421(z, null));
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "subzero", "cancelNew"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trading.contracts.ExperimentsKt$isShortingEnabled$1", m3645f = "Experiments.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trading.contracts.ExperimentsKt$isShortingEnabled$1 */
    static final class C299421 extends ContinuationImpl7 implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
        final /* synthetic */ boolean $cancelNewOverride;
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C299421(boolean z, Continuation<? super C299421> continuation) {
            super(3, continuation);
            this.$cancelNewOverride = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
            C299421 c299421 = new C299421(this.$cancelNewOverride, continuation);
            c299421.Z$0 = z;
            c299421.Z$1 = z2;
            return c299421.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(this.Z$0 && (this.Z$1 || this.$cancelNewOverride));
        }
    }
}
