package com.robinhood.android.eventcontracts.contracts;

import android.content.Context;
import com.robinhood.android.eventcontracts.experiments.EventContractsSportsExperiment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.hammer.android.EntryPoints;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HubNavigateUtils.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"navigateToEcHub", "", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "source", "", "sameActivityForV1", "", "(Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.contracts.HubNavigateUtilsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubNavigateUtils2 {

    /* compiled from: HubNavigateUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.contracts.HubNavigateUtilsKt", m3645f = "HubNavigateUtils.kt", m3646l = {19}, m3647m = "navigateToEcHub")
    /* renamed from: com.robinhood.android.eventcontracts.contracts.HubNavigateUtilsKt$navigateToEcHub$1 */
    static final class C165201 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C165201(Continuation<? super C165201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HubNavigateUtils2.navigateToEcHub(null, null, null, false, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object navigateToEcHub(Navigator navigator, Context context, String str, boolean z, Continuation<? super Unit> continuation) {
        C165201 c165201;
        Navigator navigator2;
        String str2;
        Context context2;
        boolean z2;
        if (continuation instanceof C165201) {
            c165201 = (C165201) continuation;
            int i = c165201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c165201.label = i - Integer.MIN_VALUE;
            } else {
                c165201 = new C165201(continuation);
            }
        }
        Object objFirstOrNull = c165201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c165201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(((HubNavigateUtils) EntryPoints.applicationEntryPoint(context)).experimentsProvider(), new Experiment[]{EventContractsSportsExperiment.INSTANCE}, false, null, 6, null);
            c165201.L$0 = navigator;
            c165201.L$1 = context;
            c165201.L$2 = str;
            c165201.Z$0 = z;
            c165201.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamStateFlow$default, c165201);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            navigator2 = navigator;
            str2 = str;
            context2 = context;
            z2 = z;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = c165201.Z$0;
            str2 = (String) c165201.L$2;
            Context context3 = (Context) c165201.L$1;
            Navigator navigator3 = (Navigator) c165201.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
            context2 = context3;
            navigator2 = navigator3;
        }
        Boolean bool = (Boolean) objFirstOrNull;
        if (bool != null ? bool.booleanValue() : false) {
            Navigator.DefaultImpls.startActivity$default(navigator2, context2, new EventContractHubV2IntentKey(null, str2, 1, null), null, false, null, null, 60, null);
        } else {
            FragmentKey fragmentKeyConstructEcHubFragmentKey = EventContractsHubDeeplinkTarget2.constructEcHubFragmentKey(str2);
            if (z2) {
                Navigator.DefaultImpls.showFragment$default(navigator2, context2, fragmentKeyConstructEcHubFragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
            } else {
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator2, context2, fragmentKeyConstructEcHubFragmentKey, false, false, false, false, null, false, null, null, 1020, null);
            }
        }
        return Unit.INSTANCE;
    }
}
