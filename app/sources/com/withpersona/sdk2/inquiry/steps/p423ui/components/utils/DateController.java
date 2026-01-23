package com.withpersona.sdk2.inquiry.steps.p423ui.components.utils;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.squareup.workflow1.p415ui.TextController;
import com.squareup.workflow1.p415ui.TextController3;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DateController.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001f\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010%\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/DateController;", "", "", "initialValue", "monthPlaceholder", "", "monthList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "year", ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, "day", "format", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/List;", "getMonthList", "()Ljava/util/List;", "Lcom/squareup/workflow1/ui/TextController;", "yearController", "Lcom/squareup/workflow1/ui/TextController;", "getYearController", "()Lcom/squareup/workflow1/ui/TextController;", "monthController", "getMonthController", "dayController", "getDayController", "Lkotlinx/coroutines/flow/Flow;", "onChanged", "Lkotlinx/coroutines/flow/Flow;", "getOnChanged", "()Lkotlinx/coroutines/flow/Flow;", "getValue", "()Ljava/lang/String;", "value", "Ljava/util/Date;", "getDateValue", "()Ljava/util/Date;", "dateValue", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DateController {
    private final TextController dayController;
    private final TextController monthController;
    private final List<String> monthList;
    private final Flow<String> onChanged;
    private final TextController yearController;

    public DateController(String str, String str2, List<String> monthList) {
        String str3;
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        this.monthList = monthList;
        List listSplit$default = str != null ? StringsKt.split$default((CharSequence) str, new char[]{'-'}, false, 0, 6, (Object) null) : null;
        listSplit$default = (listSplit$default == null || listSplit$default.size() != 3) ? CollectionsKt.listOf((Object[]) new String[]{"", "", ""}) : listSplit$default;
        this.yearController = TextController3.TextController((String) listSplit$default.get(0));
        try {
            str3 = monthList.get(Integer.parseInt((String) listSplit$default.get(1)) - 1);
        } catch (NumberFormatException unused) {
            str3 = str2 == null ? "" : str2;
        }
        this.monthController = TextController3.TextController(str3);
        this.dayController = TextController3.TextController((String) listSplit$default.get(2));
        this.onChanged = FlowKt.flow(new C437691(null));
    }

    public final TextController getYearController() {
        return this.yearController;
    }

    public final TextController getMonthController() {
        return this.monthController;
    }

    public final TextController getDayController() {
        return this.dayController;
    }

    public final Flow<String> getOnChanged() {
        return this.onChanged;
    }

    public final String getValue() {
        return format(this.yearController.getTextValue(), this.monthController.getTextValue(), this.dayController.getTextValue());
    }

    public final Date getDateValue() {
        try {
            List listSplit$default = StringsKt.split$default((CharSequence) getValue(), new char[]{'-'}, false, 0, 6, (Object) null);
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, Integer.parseInt((String) listSplit$default.get(0)));
            calendar.set(2, Integer.parseInt((String) listSplit$default.get(1)) - 1);
            calendar.set(5, Integer.parseInt((String) listSplit$default.get(2)));
            return calendar.getTime();
        } catch (Exception unused) {
            return null;
        }
    }

    /* compiled from: DateController.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.steps.ui.components.utils.DateController$1", m3645f = "DateController.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.utils.DateController$1 */
    static final class C437691 extends ContinuationImpl7 implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C437691(Continuation<? super C437691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C437691 c437691 = DateController.this.new C437691(continuation);
            c437691.L$0 = obj;
            return c437691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super String> flowCollector, Continuation<? super Unit> continuation) {
            return ((C437691) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow flowMerge = FlowKt.merge(DateController.this.getYearController().getOnTextChanged(), DateController.this.getMonthController().getOnTextChanged(), DateController.this.getDayController().getOnTextChanged());
                final DateController dateController = DateController.this;
                FlowCollector flowCollector2 = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.utils.DateController.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        Object objEmit = flowCollector.emit(dateController.getValue(), continuation);
                        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowMerge.collect(flowCollector2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final String format(String year, String month, String day) {
        int iIndexOf = CollectionsKt.indexOf((List<? extends String>) this.monthList, month);
        String strPadStart = iIndexOf > -1 ? StringsKt.padStart(String.valueOf(iIndexOf + 1), 2, '0') : null;
        if (year != null && year.length() != 0 && strPadStart != null && strPadStart.length() != 0 && day != null && day.length() != 0) {
            return year + "-" + strPadStart + "-" + day;
        }
        return "";
    }
}
