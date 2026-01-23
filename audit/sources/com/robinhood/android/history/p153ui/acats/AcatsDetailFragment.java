package com.robinhood.android.history.p153ui.acats;

import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acats.contracts.AcatsFragmentKeys2;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.databinding.FragmentAcatsInDetailBinding;
import com.robinhood.android.history.p153ui.AcatsInDetailBannerView;
import com.robinhood.android.history.p153ui.BaseDetailFragment;
import com.robinhood.android.history.p153ui.acats.AcatsDetailEvent;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.serverclientcomponents.timeline.TimelineRows;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.models.serverdriven.p347db.StandardRow;
import com.robinhood.models.serverdriven.p347db.TimelineRow;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import io.noties.markwon.Markwon;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AcatsDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0002GHB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u001a\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020-2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020AH\u0002J\u0016\u0010B\u001a\u00020(2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DH\u0002J\u0010\u0010F\u001a\u00020(2\u0006\u0010@\u001a\u00020AH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020(0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/history/ui/acats/AcatsDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "Lcom/robinhood/android/history/ui/AcatsInDetailBannerView$Callbacks;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "isAcatsIn", "", "()Z", "binding", "Lcom/robinhood/android/history/databinding/FragmentAcatsInDetailBinding;", "getBinding", "()Lcom/robinhood/android/history/databinding/FragmentAcatsInDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/history/ui/acats/AcatsDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/history/ui/acats/AcatsDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "bannerAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/history/ui/AcatsInDetailBannerView;", "Lcom/robinhood/android/history/ui/AcatsInDetailBannerView$BannerViewData;", "timelineAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView;", "Lcom/robinhood/models/serverdriven/db/TimelineRow;", "handleTimelineCtaAction", "Lkotlin/Function0;", "", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "handleTimelineExtraInfoAction", "dividerAdapter", "Landroid/view/View;", "detailRowAdapter", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "Lcom/robinhood/models/serverdriven/db/StandardRow;", "goldDepositBoostAdapter", "Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "footerButtonAdapter", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "onBannerButtonClick", "uri", "Landroid/net/Uri;", "setViewState", "viewState", "Lcom/robinhood/android/history/ui/acats/AcatsDetailViewState;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailEvent;", "showHelpBottomSheet", "Args", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AcatsDetailFragment extends BaseDetailFragment implements AcatsInDetailBannerView.Callbacks {
    private final SingleItemAdapter<AcatsInDetailBannerView, AcatsInDetailBannerView.BannerViewData> bannerAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final CompositeAdapter compositeAdapter;
    private final GenericListAdapter<RdsDataRowView, StandardRow> detailRowAdapter;
    private final SingleItemAdapter<View, Unit> dividerAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> footerButtonAdapter;
    private final SingleItemAdapter<RdsDataRowView, GoldDepositBoostTransferDetail> goldDepositBoostAdapter;
    public Markwon markwon;
    private final GenericListAdapter<RdsTimelineRowView, TimelineRow> timelineAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/history/databinding/FragmentAcatsInDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<AcatsDetailEvent> event) {
        EventConsumer<AcatsDetailEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof AcatsDetailEvent.AcatsTransferLoadFailed) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m15243invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15243invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AbsErrorHandler.handleError$default(this.getActivityErrorHandler(), ((AcatsDetailEvent.AcatsTransferLoadFailed) event.getData()).getThrowable(), false, 2, null);
            }
        });
    }

    public AcatsDetailFragment() {
        super(C18359R.layout.fragment_acats_in_detail);
        this.binding = ViewBinding5.viewBinding(this, AcatsDetailFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AcatsDetailDuxo.class);
        SingleItemAdapter.Companion companion = SingleItemAdapter.INSTANCE;
        SingleItemAdapter<AcatsInDetailBannerView, AcatsInDetailBannerView.BannerViewData> singleItemAdapterOf$default = SingleItemAdapter.Companion.of$default(companion, AcatsInDetailBannerView.INSTANCE, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsDetailFragment.bannerAdapter$lambda$0(this.f$0, (AcatsInDetailBannerView) obj, (AcatsInDetailBannerView.BannerViewData) obj2);
            }
        }, 2, (Object) null);
        this.bannerAdapter = singleItemAdapterOf$default;
        GenericListAdapter.Companion companion2 = GenericListAdapter.INSTANCE;
        RdsTimelineRowView.Companion companion3 = RdsTimelineRowView.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        GenericListAdapter<RdsTimelineRowView, TimelineRow> genericListAdapterM2987of = companion2.m2987of(companion3, equality, new Function2() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsDetailFragment.timelineAdapter$lambda$1(this.f$0, (RdsTimelineRowView) obj, (TimelineRow) obj2);
            }
        });
        this.timelineAdapter = genericListAdapterM2987of;
        SingleItemAdapter<View, Unit> singleItemAdapterOfUnit$default = SingleItemAdapter.Companion.ofUnit$default(companion, C18359R.layout.include_acats_detail_divider, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        this.dividerAdapter = singleItemAdapterOfUnit$default;
        RdsDataRowView.Companion companion4 = RdsDataRowView.INSTANCE;
        GenericListAdapter<RdsDataRowView, StandardRow> genericListAdapterM2987of2 = companion2.m2987of(companion4, equality, new Function2() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsDetailFragment.detailRowAdapter$lambda$5(this.f$0, (RdsDataRowView) obj, (StandardRow) obj2);
            }
        });
        this.detailRowAdapter = genericListAdapterM2987of2;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        SingleItemAdapter<RdsDataRowView, GoldDepositBoostTransferDetail> singleItemAdapterM2993of = companion.m2993of(companion4, equality, new Function2() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsDetailFragment.goldDepositBoostAdapter$lambda$8(this.f$0, (RdsDataRowView) obj, (GoldDepositBoostTransferDetail) obj2);
            }
        });
        this.goldDepositBoostAdapter = singleItemAdapterM2993of;
        this.footerButtonAdapter = companion2.m2987of(ClientComponentButtonView.INSTANCE, equality, new Function2() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsDetailFragment.footerButtonAdapter$lambda$9((ClientComponentButtonView) obj, (ServerDrivenButton) obj2);
            }
        });
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterOf$default, genericListAdapterM2987of, singleItemAdapterOfUnit$default, genericListAdapterM2987of2, singleItemAdapterM2993of});
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        Args args = (Args) INSTANCE.getArgs((Fragment) this);
        if (args instanceof Args.AcatsIn) {
            String string2 = ((Args.AcatsIn) args).getAcatInTransferId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
        if (args instanceof Args.AcatsOut) {
            return "ACATS_OUT";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean isAcatsIn() {
        return INSTANCE.getArgs((Fragment) this) instanceof Args.AcatsIn;
    }

    private final FragmentAcatsInDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInDetailBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsDetailDuxo getDuxo() {
        return (AcatsDetailDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bannerAdapter$lambda$0(AcatsDetailFragment acatsDetailFragment, AcatsInDetailBannerView of, AcatsInDetailBannerView.BannerViewData it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        of.bind(it, acatsDetailFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit timelineAdapter$lambda$1(AcatsDetailFragment acatsDetailFragment, RdsTimelineRowView of, TimelineRow item) {
        RdsTimelineRowView.State rdsTimelineRowViewState;
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setPrimaryText(item.getPrimaryText());
        of.setMetadataText(item.getMetadataText());
        of.setCtaButtonText(item.getCtaButtonText());
        of.onCtaButtonClick(acatsDetailFragment.handleTimelineCtaAction(item.getCtaAction()));
        of.setPrimaryTextIcon(item.getExtraInfoType() == TimelineRow.ExtraInfo.TITLE ? ViewsKt.getDrawable(of, C20690R.drawable.ic_rds_info_16dp) : null);
        of.onNormalTextClick(acatsDetailFragment.handleTimelineExtraInfoAction(item.getExtraInfoAction()));
        if (acatsDetailFragment.isAcatsIn() && item.getPosition() == TimelineRow.Position.BOTTOM) {
            rdsTimelineRowViewState = RdsTimelineRowView.State.INCOMPLETE;
        } else {
            rdsTimelineRowViewState = TimelineRows.toRdsTimelineRowViewState(item);
        }
        of.setState(rdsTimelineRowViewState);
        of.setPosition(TimelineRows.toViewPosition(item.getPosition()));
        if (of.getState() == RdsTimelineRowView.State.COMPLETE) {
            of.setIconStyle(RdsTimelineRowView.IconStyle.FILLED);
            of.setIconDrawable(ViewsKt.getDrawable(of, C20690R.drawable.ic_rds_checkmark_16dp));
        }
        return Unit.INSTANCE;
    }

    private final Function0<Unit> handleTimelineCtaAction(final GenericAction action) {
        return new Function0() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsDetailFragment.handleTimelineCtaAction$lambda$2(action, this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleTimelineCtaAction$lambda$2(GenericAction genericAction, AcatsDetailFragment acatsDetailFragment) {
        if (genericAction instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = acatsDetailFragment.getNavigator();
            Context contextRequireContext = acatsDetailFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((GenericAction.DeeplinkAction) genericAction).getUri(), null, null, false, null, 60, null);
            acatsDetailFragment.getDuxo().logCtaTap();
        } else if (genericAction != null) {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(genericAction);
            throw new ExceptionsH();
        }
        return Unit.INSTANCE;
    }

    private final Function0<Unit> handleTimelineExtraInfoAction(final GenericAction action) {
        return new Function0() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsDetailFragment.handleTimelineExtraInfoAction$lambda$3(action, this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleTimelineExtraInfoAction$lambda$3(GenericAction genericAction, AcatsDetailFragment acatsDetailFragment) {
        if (genericAction instanceof GenericAction.InfoAlertAction) {
            GenericAction.InfoAlertAction infoAlertAction = (GenericAction.InfoAlertAction) genericAction;
            Navigator.DefaultImpls.createDialogFragment$default(acatsDetailFragment.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(infoAlertAction.getAlert(), true, false, 0, 12, (DefaultConstructorMarker) null), null, 2, null).show(acatsDetailFragment.requireActivity().getSupportFragmentManager(), infoAlertAction.getAlert().getTitle());
        } else if (genericAction != null) {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(genericAction);
            throw new ExceptionsH();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detailRowAdapter$lambda$5(final AcatsDetailFragment acatsDetailFragment, final RdsDataRowView of, StandardRow row) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(row, "row");
        of.setLabelText(row.getLabel());
        of.setValueText(row.getValue());
        final GenericAction annotatedAction = row.getAnnotatedAction();
        if (annotatedAction instanceof GenericAction.DeeplinkAction) {
            OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailFragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AcatsDetailFragment.detailRowAdapter$lambda$5$lambda$4(this.f$0, of, annotatedAction);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detailRowAdapter$lambda$5$lambda$4(AcatsDetailFragment acatsDetailFragment, RdsDataRowView rdsDataRowView, GenericAction genericAction) {
        Navigator navigator = acatsDetailFragment.getNavigator();
        Context context = rdsDataRowView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) genericAction).getUri(), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goldDepositBoostAdapter$lambda$8(AcatsDetailFragment acatsDetailFragment, RdsDataRowView of, GoldDepositBoostTransferDetail goldDepositBoost) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(goldDepositBoost, "goldDepositBoost");
        of.setLabelText(goldDepositBoost.getAmountTitle());
        of.setValueText(goldDepositBoost.getAmountText());
        ServerToBentoAssetMapper2 iconAsset = goldDepositBoost.getIconAsset();
        if (iconAsset != null) {
            of.setValueIconRightDrawable(ViewsKt.getDrawable(of, iconAsset.getResourceId()));
            of.setValueIconTint(ColorStateList.valueOf(ViewsKt.getColor(of, C20690R.color.mobius_sol_light_day)));
        }
        String detailText = goldDepositBoost.getDetailText();
        if (detailText != null) {
            of.setDescriptionText(acatsDetailFragment.getMarkwon().toMarkdown(detailText));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit footerButtonAdapter$lambda$9(ClientComponentButtonView of, ServerDrivenButton it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        ViewsKt.setHorizontalPadding(of, (int) ViewsKt.getDimension(of, C13997R.dimen.rds_spacing_medium));
        of.bind(it);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = getBinding().rowRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        bindAdapter(recyclerView, this.compositeAdapter);
        setRecyclerviewForToolbarScrollAnimator(recyclerView);
        RecyclerView footerButtonsRecyclerView = getBinding().footerButtonsRecyclerView;
        Intrinsics.checkNotNullExpressionValue(footerButtonsRecyclerView, "footerButtonsRecyclerView");
        bindAdapter(footerButtonsRecyclerView, this.footerButtonAdapter);
        BaseFragment.collectDuxoState$default(this, null, new C184232(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C184243(null), 1, null);
    }

    /* compiled from: AcatsDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.acats.AcatsDetailFragment$onViewCreated$2", m3645f = "AcatsDetailFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.history.ui.acats.AcatsDetailFragment$onViewCreated$2 */
    static final class C184232 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C184232(Continuation<? super C184232> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsDetailFragment.this.new C184232(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C184232) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.history.ui.acats.AcatsDetailFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsDetailFragment $tmp0;

            AnonymousClass1(AcatsDetailFragment acatsDetailFragment) {
                this.$tmp0 = acatsDetailFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsDetailFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/history/ui/acats/AcatsDetailViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsDetailViewState acatsDetailViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$setViewState = C184232.invokeSuspend$setViewState(this.$tmp0, acatsDetailViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsDetailViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(AcatsDetailFragment.this.getDuxo().getStateFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsDetailFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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
        public static final /* synthetic */ Object invokeSuspend$setViewState(AcatsDetailFragment acatsDetailFragment, AcatsDetailViewState acatsDetailViewState, Continuation continuation) {
            acatsDetailFragment.setViewState(acatsDetailViewState);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AcatsDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.acats.AcatsDetailFragment$onViewCreated$3", m3645f = "AcatsDetailFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.history.ui.acats.AcatsDetailFragment$onViewCreated$3 */
    static final class C184243 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C184243(Continuation<? super C184243> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsDetailFragment.this.new C184243(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C184243) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.history.ui.acats.AcatsDetailFragment$onViewCreated$3$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsDetailFragment $tmp0;

            AnonymousClass1(AcatsDetailFragment acatsDetailFragment) {
                this.$tmp0 = acatsDetailFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsDetailFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<AcatsDetailEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C184243.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<AcatsDetailEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(AcatsDetailFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsDetailFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(AcatsDetailFragment acatsDetailFragment, Event event, Continuation continuation) {
            acatsDetailFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.history.ui.AcatsInDetailBannerView.Callbacks
    public void onBannerButtonClick(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, null, null, false, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final AcatsDetailViewState viewState) {
        ShimmerLoadingView loadingView = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(viewState.isLoading() ? 0 : 8);
        TextViewsKt.setVisibilityText(getExpandedToolbarTitleTxt(), viewState.getTitleText());
        TextViewsKt.setVisibilityText(getExpandedToolbarSubtitleTxt(), viewState.getSubtitleText());
        if (viewState.getShowHelpIcon()) {
            ImageView expandedToolbarIcon = getExpandedToolbarIcon();
            Context contextRequireContext = requireContext();
            ServerToBentoAssetMapper2 helpIcon = viewState.getHelpIcon();
            Integer numValueOf = helpIcon != null ? Integer.valueOf(helpIcon.getResourceId()) : null;
            Intrinsics.checkNotNull(numValueOf);
            expandedToolbarIcon.setImageDrawable(contextRequireContext.getDrawable(numValueOf.intValue()));
            OnClickListeners.onClick(getExpandedToolbarIcon(), new Function0() { // from class: com.robinhood.android.history.ui.acats.AcatsDetailFragment$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AcatsDetailFragment.setViewState$lambda$11(this.f$0, viewState);
                }
            });
        }
        this.bannerAdapter.setData(viewState.getBannerData());
        this.dividerAdapter.setData(viewState.getDividerData());
        this.timelineAdapter.submitList(viewState.getTimelineRows());
        this.detailRowAdapter.submitList(viewState.getDetailRows());
        this.footerButtonAdapter.submitList(viewState.getFooterButtons());
        this.goldDepositBoostAdapter.setData(viewState.getGoldDepositBoost());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$11(AcatsDetailFragment acatsDetailFragment, AcatsDetailViewState acatsDetailViewState) {
        acatsDetailFragment.showHelpBottomSheet(acatsDetailViewState);
        return Unit.INSTANCE;
    }

    private final void showHelpBottomSheet(AcatsDetailViewState viewState) {
        RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
        String alertSheetTitle = viewState.getAlertSheetTitle();
        Spanned alertSheetContentMarkdown = viewState.getAlertSheetContentMarkdown();
        GenericButton alertSheetButton = viewState.getAlertSheetButton();
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, alertSheetTitle, null, alertSheetContentMarkdown, null, alertSheetButton != null ? alertSheetButton.getTitle() : null, null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097109, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "whats_eligible");
    }

    /* compiled from: AcatsDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/history/ui/acats/AcatsDetailFragment$Args;", "Landroid/os/Parcelable;", "<init>", "()V", "AcatsIn", "AcatsOut", "Lcom/robinhood/android/history/ui/acats/AcatsDetailFragment$Args$AcatsIn;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailFragment$Args$AcatsOut;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Args implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ Args(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Args() {
        }

        /* compiled from: AcatsDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/acats/AcatsDetailFragment$Args$AcatsIn;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailFragment$Args;", "acatInTransferId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getAcatInTransferId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AcatsIn extends Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<AcatsIn> CREATOR = new Creator();
            private final UUID acatInTransferId;

            /* compiled from: AcatsDetailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AcatsIn> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AcatsIn createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AcatsIn((UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AcatsIn[] newArray(int i) {
                    return new AcatsIn[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.acatInTransferId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AcatsIn(UUID acatInTransferId) {
                super(null);
                Intrinsics.checkNotNullParameter(acatInTransferId, "acatInTransferId");
                this.acatInTransferId = acatInTransferId;
            }

            public final UUID getAcatInTransferId() {
                return this.acatInTransferId;
            }
        }

        /* compiled from: AcatsDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/acats/AcatsDetailFragment$Args$AcatsOut;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailFragment$Args;", "rhsAccountNumber", "", "<init>", "(Ljava/lang/String;)V", "getRhsAccountNumber", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AcatsOut extends Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<AcatsOut> CREATOR = new Creator();
            private final String rhsAccountNumber;

            /* compiled from: AcatsDetailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AcatsOut> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AcatsOut createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AcatsOut(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AcatsOut[] newArray(int i) {
                    return new AcatsOut[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AcatsOut() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.rhsAccountNumber);
            }

            public /* synthetic */ AcatsOut(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final String getRhsAccountNumber() {
                return this.rhsAccountNumber;
            }

            public AcatsOut(String str) {
                super(null);
                this.rhsAccountNumber = str;
            }
        }
    }

    /* compiled from: AcatsDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/history/ui/acats/AcatsDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailFragment;", "Lcom/robinhood/android/history/ui/acats/AcatsDetailFragment$Args;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/acats/contracts/AcatsDetail;", "<init>", "()V", "createFragment", "key", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AcatsDetailFragment, Args>, FragmentResolver<AcatsFragmentKeys2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AcatsDetailFragment acatsDetailFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, acatsDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsDetailFragment newInstance(Args args) {
            return (AcatsDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsDetailFragment acatsDetailFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, acatsDetailFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public AcatsDetailFragment createFragment(AcatsFragmentKeys2 key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (key instanceof AcatsFragmentKeys2.AcatsIn) {
                return (AcatsDetailFragment) newInstance((Parcelable) new Args.AcatsIn(((AcatsFragmentKeys2.AcatsIn) key).getAcatsInTransferId()));
            }
            if (!(key instanceof AcatsFragmentKeys2.AcatsOut)) {
                throw new NoWhenBranchMatchedException();
            }
            return (AcatsDetailFragment) newInstance((Parcelable) new Args.AcatsOut(((AcatsFragmentKeys2.AcatsOut) key).getRhsAccountNumber()));
        }
    }
}
