package com.robinhood.android.employment.p114ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.employment.C14481R;
import com.robinhood.android.employment.databinding.FragmentChooseEmploymentStatusBinding;
import com.robinhood.android.employment.p114ui.ChooseEmploymentStatusDuxo3;
import com.robinhood.android.employment.p114ui.ChooseEmploymentStatusFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.models.api.identi.ApiEmploymentInfo;
import com.robinhood.models.p355ui.bonfire.UiEmployerType;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ChooseEmploymentStatusFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0003*+,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0012H\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001aH\u0002J\f\u0010(\u001a\u00020)*\u00020\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/employment/databinding/FragmentChooseEmploymentStatusBinding;", "getBinding", "()Lcom/robinhood/android/employment/databinding/FragmentChooseEmploymentStatusBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusFragment$Callbacks;", "callbacks$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;", "duxo", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDuxo;", "getDuxo", "()Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "isFragmentLoading", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindState", "state", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusViewState;", "onEmploymentStatusClicked", "status", "setLoading", "isLoading", "toDisplayValue", "", "Callbacks", "Args", "Companion", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ChooseEmploymentStatusFragment extends BaseFragment {
    private final GenericListAdapter<RdsRowView, ApiEmploymentInfo.EmploymentStatus> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private boolean isFragmentLoading;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChooseEmploymentStatusFragment.class, "binding", "getBinding()Lcom/robinhood/android/employment/databinding/FragmentChooseEmploymentStatusBinding;", 0)), Reflection.property1(new PropertyReference1Impl(ChooseEmploymentStatusFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChooseEmploymentStatusFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusFragment$Callbacks;", "", "onEmploymentStatusSubmitted", "", "status", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;", "employerType", "Lcom/robinhood/models/ui/bonfire/UiEmployerType;", "onEmployerInfoRequired", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEmployerInfoRequired(ApiEmploymentInfo.EmploymentStatus status, UiEmployerType employerType);

        void onEmploymentStatusSubmitted(ApiEmploymentInfo.EmploymentStatus status, UiEmployerType employerType);
    }

    /* compiled from: ChooseEmploymentStatusFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiEmploymentInfo.EmploymentStatus.values().length];
            try {
                iArr[ApiEmploymentInfo.EmploymentStatus.EMPLOYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiEmploymentInfo.EmploymentStatus.SELF_EMPLOYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiEmploymentInfo.EmploymentStatus.UNEMPLOYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiEmploymentInfo.EmploymentStatus.RETIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiEmploymentInfo.EmploymentStatus.STUDENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiEmploymentInfo.EmploymentStatus.NOT_ASKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ChooseEmploymentStatusFragment() {
        super(C14481R.layout.fragment_choose_employment_status);
        this.binding = ViewBinding5.viewBinding(this, ChooseEmploymentStatusFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof ChooseEmploymentStatusFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.adapter = GenericListAdapter.INSTANCE.m2987of(RdsRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ChooseEmploymentStatusFragment.adapter$lambda$1(this.f$0, (RdsRowView) obj, (ApiEmploymentInfo.EmploymentStatus) obj2);
            }
        });
        this.duxo = DuxosKt.duxo(this, ChooseEmploymentStatusDuxo.class);
    }

    private final FragmentChooseEmploymentStatusBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentChooseEmploymentStatusBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(final ChooseEmploymentStatusFragment chooseEmploymentStatusFragment, RdsRowView of, final ApiEmploymentInfo.EmploymentStatus employmentStatusRow) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(employmentStatusRow, "employmentStatusRow");
        RdsRowView.bind$default(of, chooseEmploymentStatusFragment.toDisplayValue(employmentStatusRow), null, null, null, null, 30, null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChooseEmploymentStatusFragment.adapter$lambda$1$lambda$0(this.f$0, employmentStatusRow);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1$lambda$0(ChooseEmploymentStatusFragment chooseEmploymentStatusFragment, ApiEmploymentInfo.EmploymentStatus employmentStatus) {
        if (!chooseEmploymentStatusFragment.isFragmentLoading) {
            chooseEmploymentStatusFragment.onEmploymentStatusClicked(employmentStatus);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChooseEmploymentStatusDuxo getDuxo() {
        return (ChooseEmploymentStatusDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C144971(null), 1, null);
        RecyclerView employmentStatusRecyclerView = getBinding().employmentStatusRecyclerView;
        Intrinsics.checkNotNullExpressionValue(employmentStatusRecyclerView, "employmentStatusRecyclerView");
        bindAdapter(employmentStatusRecyclerView, this.adapter);
    }

    /* compiled from: ChooseEmploymentStatusFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$onViewCreated$1", m3645f = "ChooseEmploymentStatusFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$onViewCreated$1 */
    static final class C144971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C144971(Continuation<? super C144971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C144971 c144971 = ChooseEmploymentStatusFragment.this.new C144971(continuation);
            c144971.L$0 = obj;
            return c144971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C144971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ChooseEmploymentStatusFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$onViewCreated$1$1", m3645f = "ChooseEmploymentStatusFragment.kt", m3646l = {67}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChooseEmploymentStatusFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ChooseEmploymentStatusFragment chooseEmploymentStatusFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = chooseEmploymentStatusFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ChooseEmploymentStatusFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C498581 extends AdaptedFunctionReference implements Function2<ChooseEmploymentStatusViewState, Continuation<? super Unit>, Object>, ContinuationImpl6 {
                C498581(Object obj) {
                    super(2, obj, ChooseEmploymentStatusFragment.class, "bindState", "bindState(Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusViewState;)V", 4);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ChooseEmploymentStatusViewState chooseEmploymentStatusViewState, Continuation<? super Unit> continuation) {
                    return AnonymousClass1.invokeSuspend$bindState((ChooseEmploymentStatusFragment) this.receiver, chooseEmploymentStatusViewState, continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<ChooseEmploymentStatusViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C498581 c498581 = new C498581(this.this$0);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c498581, this) == coroutine_suspended) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$bindState(ChooseEmploymentStatusFragment chooseEmploymentStatusFragment, ChooseEmploymentStatusViewState chooseEmploymentStatusViewState, Continuation continuation) {
                chooseEmploymentStatusFragment.bindState(chooseEmploymentStatusViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(ChooseEmploymentStatusFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(ChooseEmploymentStatusFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ChooseEmploymentStatusFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$onViewCreated$1$2", m3645f = "ChooseEmploymentStatusFragment.kt", m3646l = {73}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ChooseEmploymentStatusFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ChooseEmploymentStatusFragment chooseEmploymentStatusFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = chooseEmploymentStatusFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: ChooseEmploymentStatusFragment.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$onViewCreated$1$2$1", m3645f = "ChooseEmploymentStatusFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$onViewCreated$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<ChooseEmploymentStatusDuxo3>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ChooseEmploymentStatusFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ChooseEmploymentStatusFragment chooseEmploymentStatusFragment, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = chooseEmploymentStatusFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Event<ChooseEmploymentStatusDuxo3> event, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    EventConsumer eventConsumer;
                    EventConsumer eventConsumer2;
                    EventConsumer eventConsumer3;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final Event event = (Event) this.L$0;
                    final ChooseEmploymentStatusFragment chooseEmploymentStatusFragment = this.this$0;
                    if ((event.getData() instanceof ChooseEmploymentStatusDuxo3.EmployerInfoRequired) && (eventConsumer3 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer3.consume(event, new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$onViewCreated$1$2$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m13487invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13487invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                chooseEmploymentStatusFragment.getCallbacks().onEmployerInfoRequired(((ChooseEmploymentStatusDuxo3.EmployerInfoRequired) event.getData()).getEmploymentStatus(), ((ChooseEmploymentStatusFragment.Args) ChooseEmploymentStatusFragment.INSTANCE.getArgs((Fragment) chooseEmploymentStatusFragment)).getEmployerTypes());
                            }
                        });
                    }
                    final ChooseEmploymentStatusFragment chooseEmploymentStatusFragment2 = this.this$0;
                    if ((event.getData() instanceof ChooseEmploymentStatusDuxo3.EmploymentSubmitted) && (eventConsumer2 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer2.consume(event, new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$onViewCreated$1$2$1$invokeSuspend$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m13488invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13488invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                chooseEmploymentStatusFragment2.getCallbacks().onEmploymentStatusSubmitted(((ChooseEmploymentStatusDuxo3.EmploymentSubmitted) event.getData()).getEmploymentStatus(), ((ChooseEmploymentStatusFragment.Args) ChooseEmploymentStatusFragment.INSTANCE.getArgs((Fragment) chooseEmploymentStatusFragment2)).getEmployerTypes());
                            }
                        });
                    }
                    final ChooseEmploymentStatusFragment chooseEmploymentStatusFragment3 = this.this$0;
                    if ((event.getData() instanceof ChooseEmploymentStatusDuxo3.Error) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$onViewCreated$1$2$1$invokeSuspend$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m13489invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13489invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AbsErrorHandler.handleError$default(chooseEmploymentStatusFragment3.getActivityErrorHandler(), ((ChooseEmploymentStatusDuxo3.Error) event.getData()).getT(), false, 2, null);
                            }
                        });
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(ChooseEmploymentStatusViewState state) {
        this.adapter.submitList(state.getOptions());
        setLoading(state.isLoading());
    }

    private final void onEmploymentStatusClicked(ApiEmploymentInfo.EmploymentStatus status) {
        getDuxo().submitEmploymentIfAvailable(status);
    }

    private final void setLoading(boolean isLoading) {
        requireToolbar().setLoadingViewVisible(isLoading);
        this.isFragmentLoading = isLoading;
    }

    private final String toDisplayValue(ApiEmploymentInfo.EmploymentStatus employmentStatus) {
        int i;
        switch (WhenMappings.$EnumSwitchMapping$0[employmentStatus.ordinal()]) {
            case 1:
                i = C14481R.string.employment_status_employed;
                break;
            case 2:
                i = C14481R.string.employment_status_self_employed;
                break;
            case 3:
                i = C14481R.string.employment_status_unemployed;
                break;
            case 4:
                i = C14481R.string.employment_status_retired;
                break;
            case 5:
                i = C14481R.string.employment_status_student;
                break;
            case 6:
                i = C14481R.string.employment_status_not_asked;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* compiled from: ChooseEmploymentStatusFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusFragment$Args;", "Landroid/os/Parcelable;", "employerTypes", "Lcom/robinhood/models/ui/bonfire/UiEmployerType;", "<init>", "(Lcom/robinhood/models/ui/bonfire/UiEmployerType;)V", "getEmployerTypes", "()Lcom/robinhood/models/ui/bonfire/UiEmployerType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiEmployerType employerTypes;

        /* compiled from: ChooseEmploymentStatusFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UiEmployerType) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UiEmployerType uiEmployerType, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEmployerType = args.employerTypes;
            }
            return args.copy(uiEmployerType);
        }

        /* renamed from: component1, reason: from getter */
        public final UiEmployerType getEmployerTypes() {
            return this.employerTypes;
        }

        public final Args copy(UiEmployerType employerTypes) {
            Intrinsics.checkNotNullParameter(employerTypes, "employerTypes");
            return new Args(employerTypes);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.employerTypes, ((Args) other).employerTypes);
        }

        public int hashCode() {
            return this.employerTypes.hashCode();
        }

        public String toString() {
            return "Args(employerTypes=" + this.employerTypes + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.employerTypes, flags);
        }

        public Args(UiEmployerType employerTypes) {
            Intrinsics.checkNotNullParameter(employerTypes, "employerTypes");
            this.employerTypes = employerTypes;
        }

        public final UiEmployerType getEmployerTypes() {
            return this.employerTypes;
        }
    }

    /* compiled from: ChooseEmploymentStatusFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusFragment;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusFragment$Args;", "<init>", "()V", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ChooseEmploymentStatusFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ChooseEmploymentStatusFragment chooseEmploymentStatusFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, chooseEmploymentStatusFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ChooseEmploymentStatusFragment newInstance(Args args) {
            return (ChooseEmploymentStatusFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ChooseEmploymentStatusFragment chooseEmploymentStatusFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, chooseEmploymentStatusFragment, args);
        }
    }
}
