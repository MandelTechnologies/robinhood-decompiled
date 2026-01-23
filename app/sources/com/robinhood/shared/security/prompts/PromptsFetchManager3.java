package com.robinhood.shared.security.prompts;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.shared.security.contracts.PromptsHandlingInfo;
import com.robinhood.shared.security.contracts.PromptsHandlingIntentKey;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: PromptsFetchManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.security.prompts.PromptsFetchManager$startFetching$1", m3645f = "PromptsFetchManager.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.security.prompts.PromptsFetchManager$startFetching$1, reason: use source file name */
/* loaded from: classes6.dex */
final class PromptsFetchManager3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ PromptsFetchManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromptsFetchManager3(PromptsFetchManager promptsFetchManager, Continuation<? super PromptsFetchManager3> continuation) {
        super(2, continuation);
        this.this$0 = promptsFetchManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PromptsFetchManager3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PromptsFetchManager3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r15 == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0103, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(5000, r14) == r0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0103 -> B:9:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Boolean bool2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{PromptsKillswitches.INSTANCE}, false, null, 6, null);
            this.label = 1;
            obj = RxAwait3.awaitFirst(observableStreamState$default, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            bool = (Boolean) obj;
            if (JobKt.isActive(getContext())) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bool2 = (Boolean) this.L$0;
                ResultKt.throwOnFailure(obj);
                bool = bool2;
                if (JobKt.isActive(getContext())) {
                    if (this.this$0.promptsFetchKillswitch.getEnabled()) {
                        return Unit.INSTANCE;
                    }
                    PromptsFetchManager promptsFetchManager = this.this$0;
                    this.L$0 = bool;
                    this.label = 3;
                    Object objFetchPendingChallengeHandlingInfo = promptsFetchManager.fetchPendingChallengeHandlingInfo(this);
                    if (objFetchPendingChallengeHandlingInfo != coroutine_suspended) {
                        bool2 = bool;
                        obj = objFetchPendingChallengeHandlingInfo;
                        PromptsHandlingInfo promptsHandlingInfo = (PromptsHandlingInfo) obj;
                        if (this.this$0.lockscreenManager.isLocked()) {
                            return Unit.INSTANCE;
                        }
                        if (promptsHandlingInfo != null) {
                            Intent intentAddFlags = Navigator.DefaultImpls.createIntent$default(this.this$0.navigator, this.this$0.context, new PromptsHandlingIntentKey(promptsHandlingInfo), null, false, 12, null).addFlags(268435456);
                            Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
                            this.this$0.context.startActivity(intentAddFlags);
                            return Unit.INSTANCE;
                        }
                        if (bool2.booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        this.L$0 = bool2;
                        this.label = 4;
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            bool2 = (Boolean) this.L$0;
            ResultKt.throwOnFailure(obj);
            PromptsHandlingInfo promptsHandlingInfo2 = (PromptsHandlingInfo) obj;
            if (this.this$0.lockscreenManager.isLocked()) {
            }
        }
        if (((Boolean) obj).booleanValue()) {
            return Unit.INSTANCE;
        }
        Observable observableStreamState$default2 = ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.experimentsStore, new Experiment[]{PromptsKillswitches2.INSTANCE}, false, null, 6, null);
        this.label = 2;
        obj = RxAwait3.awaitFirst(observableStreamState$default2, this);
    }
}
