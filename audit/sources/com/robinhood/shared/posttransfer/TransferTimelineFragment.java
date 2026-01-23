package com.robinhood.shared.posttransfer;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.serverclientcomponents.timeline.ClientComponentTimelineRowView;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.p355ui.bonfire.UiPostTransferBanner;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.serverdriven.p347db.TimelineRow;
import com.robinhood.shared.posttransfer.TransferTimelineEvent;
import com.robinhood.shared.posttransfer.databinding.FragmentTransferTimelineBinding;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: TransferTimelineFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferTimelineFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "binding", "Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferTimelineBinding;", "getBinding", "()Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferTimelineBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/posttransfer/TransferTimelineDuxo;", "getDuxo", "()Lcom/robinhood/shared/posttransfer/TransferTimelineDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/shared/posttransfer/TransferTimelineFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/posttransfer/TransferTimelineFragment$Callbacks;", "callbacks$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/serverclientcomponents/timeline/ClientComponentTimelineRowView;", "Lcom/robinhood/models/serverdriven/db/TimelineRow;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getSurvey", "Lcom/robinhood/userleap/survey/Survey;", "Callbacks", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TransferTimelineFragment extends BaseFragment {
    private final GenericListAdapter<ClientComponentTimelineRowView, TimelineRow> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransferTimelineFragment.class, "binding", "getBinding()Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferTimelineBinding;", 0)), Reflection.property1(new PropertyReference1Impl(TransferTimelineFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/posttransfer/TransferTimelineFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TransferTimelineFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferTimelineFragment$Callbacks;", "", "onContinueClick", "", "handleGenericAction", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void handleGenericAction(GenericAction action);

        void onContinueClick();
    }

    public TransferTimelineFragment() {
        super(C39496R.layout.fragment_transfer_timeline);
        this.binding = ViewBinding5.viewBinding(this, TransferTimelineFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, TransferTimelineDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.posttransfer.TransferTimelineFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.adapter = GenericListAdapter.INSTANCE.m2987of(ClientComponentTimelineRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.shared.posttransfer.TransferTimelineFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TransferTimelineFragment.adapter$lambda$0((ClientComponentTimelineRowView) obj, (TimelineRow) obj2);
            }
        });
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final FragmentTransferTimelineBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTransferTimelineBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransferTimelineDuxo getDuxo() {
        return (TransferTimelineDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$0(ClientComponentTimelineRowView of, TimelineRow state) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.bind(state);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C395211(null), 1, null);
        final FragmentTransferTimelineBinding binding = getBinding();
        GenericListAdapter<ClientComponentTimelineRowView, TimelineRow> genericListAdapter = this.adapter;
        Companion companion = INSTANCE;
        genericListAdapter.submitList(((UiPostTransferPage.Timeline) companion.getArgs((Fragment) this)).getTimeline());
        binding.recyclerView.setAdapter(this.adapter);
        binding.recyclerView.post(new Runnable() { // from class: com.robinhood.shared.posttransfer.TransferTimelineFragment$onViewCreated$2$1
            @Override // java.lang.Runnable
            public final void run() {
                View timelineShadow = binding.timelineShadow;
                Intrinsics.checkNotNullExpressionValue(timelineShadow, "timelineShadow");
                timelineShadow.setVisibility(binding.scrollView.canScrollVertically(1) ? 0 : 8);
            }
        });
        UiPostTransferBanner banner = ((UiPostTransferPage.Timeline) companion.getArgs((Fragment) this)).getBanner();
        if (banner != null) {
            RdsInfoBannerView infoBanner = binding.infoBanner;
            Intrinsics.checkNotNullExpressionValue(infoBanner, "infoBanner");
            infoBanner.setVisibility(0);
            ServerToBentoAssetMapper2 icon = banner.getIcon();
            if (icon != null) {
                binding.infoBanner.setIcon(ContextCompat.getDrawable(requireContext(), icon.getResourceId()));
            }
            RdsInfoBannerView rdsInfoBannerView = binding.infoBanner;
            RichText info = banner.getInfo();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            rdsInfoBannerView.setText(RichTexts.toSpannableString$default(info, contextRequireContext, null, false, null, 14, null));
            binding.infoBanner.setCtaText(banner.getActionText());
        }
        binding.titleTxt.setText(((UiPostTransferPage.Timeline) companion.getArgs((Fragment) this)).getTitle());
        RhTextView rhTextView = binding.subtitleTxt;
        RichText subtitle = ((UiPostTransferPage.Timeline) companion.getArgs((Fragment) this)).getSubtitle();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        rhTextView.setText(RichTexts.toSpannableString$default(subtitle, contextRequireContext2, null, false, null, 14, null));
        RhTextView rhTextView2 = binding.detailTxt;
        RichText detail = ((UiPostTransferPage.Timeline) companion.getArgs((Fragment) this)).getDetail();
        Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
        rhTextView2.setText(RichTexts.toSpannableString$default(detail, contextRequireContext3, null, false, null, 14, null));
        binding.continueBtn.setText(((UiPostTransferPage.Timeline) companion.getArgs((Fragment) this)).getPrimaryButton().getTitle());
        RdsButton continueBtn = binding.continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        OnClickListeners.onClick(continueBtn, new TransferTimelineFragment4(getCallbacks()));
        final GenericButton secondaryButton = ((UiPostTransferPage.Timeline) companion.getArgs((Fragment) this)).getSecondaryButton();
        if (secondaryButton != null) {
            RdsButton secondaryBtn = binding.secondaryBtn;
            Intrinsics.checkNotNullExpressionValue(secondaryBtn, "secondaryBtn");
            secondaryBtn.setVisibility(0);
            binding.secondaryBtn.setText(secondaryButton.getTitle());
            RdsButton secondaryBtn2 = binding.secondaryBtn;
            Intrinsics.checkNotNullExpressionValue(secondaryBtn2, "secondaryBtn");
            OnClickListeners.onClick(secondaryBtn2, new Function0() { // from class: com.robinhood.shared.posttransfer.TransferTimelineFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferTimelineFragment.onViewCreated$lambda$5$lambda$4$lambda$3(this.f$0, secondaryButton);
                }
            });
        }
        Survey survey = getSurvey();
        if (survey != null) {
            getUserLeapManager().presentSurveyIfNecessary(this, survey);
        }
    }

    /* compiled from: TransferTimelineFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.posttransfer.TransferTimelineFragment$onViewCreated$1", m3645f = "TransferTimelineFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.posttransfer.TransferTimelineFragment$onViewCreated$1 */
    static final class C395211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C395211(Continuation<? super C395211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C395211 c395211 = TransferTimelineFragment.this.new C395211(continuation);
            c395211.L$0 = obj;
            return c395211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C395211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TransferTimelineFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.posttransfer.TransferTimelineFragment$onViewCreated$1$1", m3645f = "TransferTimelineFragment.kt", m3646l = {61}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.posttransfer.TransferTimelineFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TransferTimelineFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TransferTimelineFragment transferTimelineFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = transferTimelineFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final TransferTimelineFragment transferTimelineFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.shared.posttransfer.TransferTimelineFragment.onViewCreated.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<TransferTimelineEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<TransferTimelineEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<TransferTimelineEvent> eventConsumerInvoke;
                            final TransferTimelineFragment transferTimelineFragment2 = transferTimelineFragment;
                            if ((event.getData() instanceof TransferTimelineEvent.LaunchNgGoldEarningsBottomSheet) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.posttransfer.TransferTimelineFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m25630invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m25630invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        Navigator.DefaultImpls.createDialogFragment$default(transferTimelineFragment2.getNavigator(), ((TransferTimelineEvent.LaunchNgGoldEarningsBottomSheet) event.getData()).getKey(), null, 2, null).show(transferTimelineFragment2.getChildFragmentManager(), "accountSelectionDialog");
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(TransferTimelineFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4$lambda$3(TransferTimelineFragment transferTimelineFragment, GenericButton genericButton) {
        transferTimelineFragment.getCallbacks().handleGenericAction(genericButton.getTypedAction());
        return Unit.INSTANCE;
    }

    private final Survey getSurvey() {
        Survey next;
        Iterator<Survey> it = Survey.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(next.getServerValue(), ((UiPostTransferPage.Timeline) INSTANCE.getArgs((Fragment) this)).getSurveyName())) {
                break;
            }
        }
        return next;
    }

    /* compiled from: TransferTimelineFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferTimelineFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/posttransfer/TransferTimelineFragment;", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$Timeline;", "<init>", "()V", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TransferTimelineFragment, UiPostTransferPage.Timeline> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiPostTransferPage.Timeline getArgs(TransferTimelineFragment transferTimelineFragment) {
            return (UiPostTransferPage.Timeline) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, transferTimelineFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransferTimelineFragment newInstance(UiPostTransferPage.Timeline timeline) {
            return (TransferTimelineFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, timeline);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransferTimelineFragment transferTimelineFragment, UiPostTransferPage.Timeline timeline) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, transferTimelineFragment, timeline);
        }
    }
}
