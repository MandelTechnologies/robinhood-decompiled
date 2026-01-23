package com.robinhood.android.common.recurring.bottomsheet;

import android.text.Spanned;
import android.text.SpannedString;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.recurring.models.RecurringInvestmentsConstants;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import java.io.IOException;
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
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: RecurringCryptoDisclosureBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroid/text/Spanned;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$collectDisclosureBody$orderTimingFlow$1", m3645f = "RecurringCryptoDisclosureBottomSheetFragment.kt", m3646l = {80, 88}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$collectDisclosureBody$orderTimingFlow$1, reason: use source file name */
/* loaded from: classes2.dex */
final class RecurringCryptoDisclosureBottomSheetFragment3 extends ContinuationImpl7 implements Function2<FlowCollector<? super Spanned>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecurringCryptoDisclosureBottomSheetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecurringCryptoDisclosureBottomSheetFragment3(RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragment, Continuation<? super RecurringCryptoDisclosureBottomSheetFragment3> continuation) {
        super(2, continuation);
        this.this$0 = recurringCryptoDisclosureBottomSheetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecurringCryptoDisclosureBottomSheetFragment3 recurringCryptoDisclosureBottomSheetFragment3 = new RecurringCryptoDisclosureBottomSheetFragment3(this.this$0, continuation);
        recurringCryptoDisclosureBottomSheetFragment3.L$0 = obj;
        return recurringCryptoDisclosureBottomSheetFragment3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Spanned> flowCollector, Continuation<? super Unit> continuation) {
        return ((RecurringCryptoDisclosureBottomSheetFragment3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RecurringCryptoDisclosureBottomSheetFragment3 recurringCryptoDisclosureBottomSheetFragment3;
        Spanned spannedValueOf;
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
        } catch (IOException unused) {
            recurringCryptoDisclosureBottomSheetFragment3 = this;
        }
        if (r1 == 0) {
            ResultKt.throwOnFailure(obj);
            r1 = (FlowCollector) this.L$0;
            StaticContentStore staticContentStore = this.this$0.getStaticContentStore();
            this.L$0 = r1;
            this.label = 1;
            recurringCryptoDisclosureBottomSheetFragment3 = this;
            try {
                obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, RecurringInvestmentsConstants.CONTENTFUL_ID_CRYPTO_ORDER_TIMING_DISCLOSURE, null, recurringCryptoDisclosureBottomSheetFragment3, 2, null);
                r1 = r1;
            } catch (IOException unused2) {
                spannedValueOf = SpannedString.valueOf("");
                flowCollector = r1;
                Intrinsics.checkNotNull(spannedValueOf);
                recurringCryptoDisclosureBottomSheetFragment3.L$0 = null;
                recurringCryptoDisclosureBottomSheetFragment3.label = 2;
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (r1 != 1) {
                if (r1 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            recurringCryptoDisclosureBottomSheetFragment3 = this;
            r1 = flowCollector2;
        }
        spannedValueOf = recurringCryptoDisclosureBottomSheetFragment3.this$0.getMarkwon().toMarkdown(((Disclosure) ((EntryResource) obj).getValue()).getContent().getRaw());
        flowCollector = r1;
        Intrinsics.checkNotNull(spannedValueOf);
        recurringCryptoDisclosureBottomSheetFragment3.L$0 = null;
        recurringCryptoDisclosureBottomSheetFragment3.label = 2;
    }
}
