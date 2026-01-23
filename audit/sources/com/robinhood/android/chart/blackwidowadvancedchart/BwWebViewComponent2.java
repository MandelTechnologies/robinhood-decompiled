package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BwWebViewComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "templates", "", "activeTemplateId", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$activeTemplate$1", m3645f = "BwWebViewComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$activeTemplate$1, reason: use source file name */
/* loaded from: classes7.dex */
final class BwWebViewComponent2 extends ContinuationImpl7 implements Function3<List<? extends TemplateDto>, String, Continuation<? super TemplateDto>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    BwWebViewComponent2(Continuation<? super BwWebViewComponent2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends TemplateDto> list, String str, Continuation<? super TemplateDto> continuation) {
        return invoke2((List<TemplateDto>) list, str, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<TemplateDto> list, String str, Continuation<? super TemplateDto> continuation) {
        BwWebViewComponent2 bwWebViewComponent2 = new BwWebViewComponent2(continuation);
        bwWebViewComponent2.L$0 = list;
        bwWebViewComponent2.L$1 = str;
        return bwWebViewComponent2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) this.L$0;
        String str = (String) this.L$1;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((TemplateDto) next).getId(), str)) {
                obj2 = next;
                break;
            }
        }
        return (TemplateDto) obj2;
    }
}
