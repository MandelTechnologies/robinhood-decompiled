package com.robinhood.android.history.p153ui.transfer;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.history.databinding.FragmentDebitCardTransferDetailBinding;
import com.robinhood.android.history.p153ui.transfer.InstantTransferDetailFragment;
import com.robinhood.android.history.p153ui.transfer.MatchaTextStory;
import com.robinhood.android.history.util.UppercaseFirst;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.history.formatters.legacy.rhy.UtilsKt;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import com.robinhood.transfers.api.ApiGracePeriodContent;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.Direction;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InstantTransferDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 B2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002ABB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u00020)2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020)H\u0016J\u001b\u00105\u001a\u00020)2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000307H\u0003¢\u0006\u0002\u00108J\u0010\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020\u0003H\u0016J \u0010;\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J \u0010@\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020%X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/history/ui/transfer/InstantTransferDetailFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "getAchRelationshipStore", "()Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "setAchRelationshipStore", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;)V", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "getDebitCardInstrumentStore", "()Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "setDebitCardInstrumentStore", "(Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;)V", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "getPaymentTransferStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "setPaymentTransferStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;)V", "binding", "Lcom/robinhood/android/history/databinding/FragmentDebitCardTransferDetailBinding;", "getBinding", "()Lcom/robinhood/android/history/databinding/FragmentDebitCardTransferDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "GracePeriodContent", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/runtime/Composer;I)V", "handle", "action", "handleNonReadyPendingState", "transfer", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "paymentInstrument", "Lcom/robinhood/models/db/AchRelationship;", "handleNewReadyPendingState", "Args", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InstantTransferDetailFragment extends BaseRhBottomSheetDialogHostFragment implements SduiActionHandler<GenericAction> {
    public AchRelationshipStore achRelationshipStore;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public DebitCardInstrumentStore debitCardInstrumentStore;
    public Markwon markwon;
    public PaymentTransferStore paymentTransferStore;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InstantTransferDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/history/databinding/FragmentDebitCardTransferDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InstantTransferDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferType.values().length];
            try {
                iArr[TransferType.DEBIT_CARD_TRANSFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferType.INSTANT_BANK_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Money.Direction.values().length];
            try {
                iArr2[Money.Direction.DEBIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Money.Direction.CREDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GracePeriodContent$lambda$14(InstantTransferDetailFragment instantTransferDetailFragment, UIComponent uIComponent, int i, Composer composer, int i2) {
        instantTransferDetailFragment.GracePeriodContent(uIComponent, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public InstantTransferDetailFragment() {
        super(C18359R.layout.fragment_debit_card_transfer_detail);
        this.binding = ViewBinding5.viewBinding(this, InstantTransferDetailFragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
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

    public final AchRelationshipStore getAchRelationshipStore() {
        AchRelationshipStore achRelationshipStore = this.achRelationshipStore;
        if (achRelationshipStore != null) {
            return achRelationshipStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("achRelationshipStore");
        return null;
    }

    public final void setAchRelationshipStore(AchRelationshipStore achRelationshipStore) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "<set-?>");
        this.achRelationshipStore = achRelationshipStore;
    }

    public final DebitCardInstrumentStore getDebitCardInstrumentStore() {
        DebitCardInstrumentStore debitCardInstrumentStore = this.debitCardInstrumentStore;
        if (debitCardInstrumentStore != null) {
            return debitCardInstrumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("debitCardInstrumentStore");
        return null;
    }

    public final void setDebitCardInstrumentStore(DebitCardInstrumentStore debitCardInstrumentStore) {
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "<set-?>");
        this.debitCardInstrumentStore = debitCardInstrumentStore;
    }

    public final PaymentTransferStore getPaymentTransferStore() {
        PaymentTransferStore paymentTransferStore = this.paymentTransferStore;
        if (paymentTransferStore != null) {
            return paymentTransferStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentTransferStore");
        return null;
    }

    public final void setPaymentTransferStore(PaymentTransferStore paymentTransferStore) {
        Intrinsics.checkNotNullParameter(paymentTransferStore, "<set-?>");
        this.paymentTransferStore = paymentTransferStore;
    }

    private final FragmentDebitCardTransferDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDebitCardTransferDetailBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setVisibility(0);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<R> observableSwitchMap = getPaymentTransferStore().getPaymentTransfer(((Args) INSTANCE.getArgs((Fragment) this)).getInstantTransferId(), true).switchMap(new Function() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment$onStart$$inlined$switchMap$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstantTransferDetailFragment$onStart$$inlined$switchMap$1<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends R> apply(final T t) {
                Observable<R> observableJust;
                Observable debitCardInstrument;
                Intrinsics.checkNotNullParameter(t, "t");
                PaymentTransfer paymentTransfer = (PaymentTransfer) t;
                if (!paymentTransfer.getIsOwner()) {
                    observableJust = Observable.just(Optional2.INSTANCE);
                    Intrinsics.checkNotNull(observableJust);
                } else {
                    int i = InstantTransferDetailFragment.WhenMappings.$EnumSwitchMapping$0[paymentTransfer.getTransferType().ordinal()];
                    if (i == 1) {
                        debitCardInstrument = this.this$0.getDebitCardInstrumentStore().getDebitCardInstrument(StringsKt.toUuid(paymentTransfer.getReceivingAccountId()));
                    } else if (i == 2) {
                        debitCardInstrument = this.this$0.getAchRelationshipStore().getAchRelationship(StringsKt.toUuid(paymentTransfer.getReceivingAccountId()));
                    } else {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Unsupported transfer type: " + paymentTransfer.getTransferType() + ". Id: " + paymentTransfer.getId()), false, null, 4, null);
                        debitCardInstrument = Observable.empty();
                    }
                    Intrinsics.checkNotNull(debitCardInstrument);
                    observableJust = debitCardInstrument.map(new Function() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment$onStart$lambda$2$$inlined$fetchAdditionalDataIfOwner$1
                        @Override // io.reactivex.functions.Function
                        public final Optional<T> apply(T it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Optional3.asOptional(it);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // io.reactivex.functions.Function
                        public /* bridge */ /* synthetic */ Object apply(Object obj) {
                            return apply((PaymentTransfers2<T, R>) obj);
                        }
                    });
                    Intrinsics.checkNotNull(observableJust);
                }
                return observableJust.map(new Function() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment$onStart$$inlined$switchMap$1.1
                    @Override // io.reactivex.functions.Function
                    public final R apply(Optional<? extends Object> u) {
                        Intrinsics.checkNotNullParameter(u, "u");
                        Object obj = t;
                        Intrinsics.checkNotNull(obj);
                        return (R) Tuples4.m3642to((PaymentTransfer) obj, u.component1());
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        Observable observableSubscribeOn = observableSwitchMap.subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSubscribeOn), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantTransferDetailFragment.onStart$lambda$13(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onStart$lambda$13(final InstantTransferDetailFragment instantTransferDetailFragment, Tuples2 tuples2) {
        int i;
        String accountNameTitle;
        int i2;
        String strUppercaseFirst;
        ApiGoldDepositBoostTransferDetail gold_deposit_boost;
        final ApiGracePeriodContent gracePeriodContent;
        PaymentTransfer paymentTransfer = (PaymentTransfer) tuples2.component1();
        Object objComponent2 = tuples2.component2();
        FragmentDebitCardTransferDetailBinding binding = instantTransferDetailFragment.getBinding();
        if (paymentTransfer.getDirection() == Direction.PULL && paymentTransfer.getTransferType() == TransferType.INSTANT_BANK_TRANSFER) {
            Intrinsics.checkNotNull(objComponent2, "null cannot be cast to non-null type com.robinhood.models.db.AchRelationship");
            AchRelationship achRelationship = (AchRelationship) objComponent2;
            if (CollectionsKt.listOf((Object[]) new TransferState[]{TransferState.NEW, TransferState.READY, TransferState.PENDING}).contains(paymentTransfer.getState())) {
                instantTransferDetailFragment.handleNewReadyPendingState(instantTransferDetailFragment.getBinding(), paymentTransfer, achRelationship);
            } else {
                instantTransferDetailFragment.handleNonReadyPendingState(instantTransferDetailFragment.getBinding(), paymentTransfer, achRelationship);
            }
        } else {
            binding.genericInstantContent.setVisibility(0);
            binding.composeContent.setVisibility(8);
            String string2 = instantTransferDetailFragment.getString(UtilsKt.getLabelResId(paymentTransfer.getState()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            binding.title.setText(instantTransferDetailFragment.getString(C18359R.string.instant_transfer_detail_title, string2));
            RhTextView rhTextView = binding.subtitle;
            Money.Direction direction = paymentTransfer.getAdjustment().getDirection();
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            int i3 = iArr[direction.ordinal()];
            if (i3 == 1) {
                i = C18359R.string.instant_transfer_debit_subtitle;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C18359R.string.instant_transfer_credit_subtitle;
            }
            BigDecimal amount = paymentTransfer.getAmount();
            Currency currency = Currencies.USD;
            rhTextView.setText(instantTransferDetailFragment.getString(i, Money.format$default(Money3.toMoney(amount, currency), null, false, null, false, 0, null, false, null, false, false, 1023, null)));
            RdsRowView rdsRowView = binding.fromRow;
            int i4 = iArr[paymentTransfer.getAdjustment().getDirection().ordinal()];
            Unit unit = null;
            if (i4 == 1) {
                PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo = paymentTransfer.getOriginatingTransferAccountInfo();
                if (originatingTransferAccountInfo != null) {
                    accountNameTitle = originatingTransferAccountInfo.getAccountNameTitle();
                }
                rdsRowView.setSecondaryText(accountNameTitle);
                RdsRowView rdsRowView2 = binding.toRow;
                i2 = iArr[paymentTransfer.getAdjustment().getDirection().ordinal()];
                if (i2 != 1) {
                }
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Resources resources = instantTransferDetailFragment.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                CharSequence instantDisplayTitle = PaymentTransfers3.getInstantDisplayTitle(resources, objComponent2, paymentTransfer);
                accountNameTitle = instantDisplayTitle != null ? UppercaseFirst.uppercaseFirst(instantDisplayTitle) : null;
                rdsRowView.setSecondaryText(accountNameTitle);
                RdsRowView rdsRowView22 = binding.toRow;
                i2 = iArr[paymentTransfer.getAdjustment().getDirection().ordinal()];
                if (i2 != 1) {
                    Resources resources2 = instantTransferDetailFragment.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    CharSequence instantDisplayTitle2 = PaymentTransfers3.getInstantDisplayTitle(resources2, objComponent2, paymentTransfer);
                    if (instantDisplayTitle2 != null) {
                        strUppercaseFirst = UppercaseFirst.uppercaseFirst(instantDisplayTitle2);
                    }
                    rdsRowView22.setSecondaryText(strUppercaseFirst);
                    binding.transferAmountRow.setSecondaryText(Money.format$default(Money3.toMoney(paymentTransfer.getNetAmount(), currency), null, false, null, false, 0, null, false, null, false, false, 1023, null));
                    MatchaTextStory matchaTextStory = MatchaTextStory.INSTANCE;
                    Context contextRequireContext = instantTransferDetailFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    MatchaTextStory.RowDisplayData rowDisplayData = matchaTextStory.getRowDisplayData(contextRequireContext, paymentTransfer.getServiceFeeDiscountDetails(), paymentTransfer.getServiceFee(), string2, paymentTransfer.getServiceFeeDiscountAmount());
                    binding.feeRow.setPrimaryText(rowDisplayData.getFeeRowPrimaryText());
                    binding.feeRow.setSecondaryText(rowDisplayData.getFeeRowSecondaryText());
                    RdsRowView feeRow = binding.feeRow;
                    Intrinsics.checkNotNullExpressionValue(feeRow, "feeRow");
                    feeRow.setVisibility(!rowDisplayData.getFeeRowVisibility() ? 0 : 8);
                    binding.statusRow.setSecondaryText(rowDisplayData.getStatusRowSecondaryText());
                    RdsRowView rdsRowView3 = binding.acatMatchRemovalRow;
                    ApiPaymentTransferDetails details = paymentTransfer.getDetails();
                    if (!(details instanceof ApiPaymentTransferDetails.ApiClawbackTransfer)) {
                    }
                    if (apiClawbackTransfer == null) {
                    }
                    Intrinsics.checkNotNull(rdsRowView3);
                    rdsRowView3.setVisibility(!(clawback_amount == null) ? 0 : 8);
                    rdsRowView3.setSecondaryText(clawback_amount == null ? Money.format$default(clawback_amount, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null);
                    ApiPaymentTransferDetails details2 = paymentTransfer.getDetails();
                    if (!(details2 instanceof ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer)) {
                    }
                    if (apiGoldDepositBoostTransfer == null) {
                    }
                    if (gold_deposit_boost != null) {
                    }
                    gracePeriodContent = paymentTransfer.getGracePeriodContent();
                    if (gracePeriodContent == null) {
                    }
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PaymentTransfer.TransferAccountInfo originatingTransferAccountInfo2 = paymentTransfer.getOriginatingTransferAccountInfo();
                    strUppercaseFirst = originatingTransferAccountInfo2 != null ? originatingTransferAccountInfo2.getAccountNameTitle() : null;
                    rdsRowView22.setSecondaryText(strUppercaseFirst);
                    binding.transferAmountRow.setSecondaryText(Money.format$default(Money3.toMoney(paymentTransfer.getNetAmount(), currency), null, false, null, false, 0, null, false, null, false, false, 1023, null));
                    MatchaTextStory matchaTextStory2 = MatchaTextStory.INSTANCE;
                    Context contextRequireContext2 = instantTransferDetailFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    MatchaTextStory.RowDisplayData rowDisplayData2 = matchaTextStory2.getRowDisplayData(contextRequireContext2, paymentTransfer.getServiceFeeDiscountDetails(), paymentTransfer.getServiceFee(), string2, paymentTransfer.getServiceFeeDiscountAmount());
                    binding.feeRow.setPrimaryText(rowDisplayData2.getFeeRowPrimaryText());
                    binding.feeRow.setSecondaryText(rowDisplayData2.getFeeRowSecondaryText());
                    RdsRowView feeRow2 = binding.feeRow;
                    Intrinsics.checkNotNullExpressionValue(feeRow2, "feeRow");
                    feeRow2.setVisibility(!rowDisplayData2.getFeeRowVisibility() ? 0 : 8);
                    binding.statusRow.setSecondaryText(rowDisplayData2.getStatusRowSecondaryText());
                    RdsRowView rdsRowView32 = binding.acatMatchRemovalRow;
                    ApiPaymentTransferDetails details3 = paymentTransfer.getDetails();
                    ApiPaymentTransferDetails.ApiClawbackTransfer apiClawbackTransfer = !(details3 instanceof ApiPaymentTransferDetails.ApiClawbackTransfer) ? (ApiPaymentTransferDetails.ApiClawbackTransfer) details3 : null;
                    Money clawback_amount = apiClawbackTransfer == null ? apiClawbackTransfer.getClawback_amount() : null;
                    Intrinsics.checkNotNull(rdsRowView32);
                    rdsRowView32.setVisibility(!(clawback_amount == null) ? 0 : 8);
                    rdsRowView32.setSecondaryText(clawback_amount == null ? Money.format$default(clawback_amount, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null);
                    ApiPaymentTransferDetails details22 = paymentTransfer.getDetails();
                    ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer apiGoldDepositBoostTransfer = !(details22 instanceof ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer) ? (ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer) details22 : null;
                    gold_deposit_boost = apiGoldDepositBoostTransfer == null ? apiGoldDepositBoostTransfer.getGold_deposit_boost() : null;
                    if (gold_deposit_boost != null) {
                        RdsDataRowView rdsDataRowView = binding.goldDepositBoostRow;
                        String amount_title = gold_deposit_boost.getAmount_title();
                        String amount_text = gold_deposit_boost.getAmount_text();
                        if (amount_title != null && amount_text != null) {
                            rdsDataRowView.setLabelText(amount_title);
                            rdsDataRowView.setValueText(amount_text);
                            String detail_text = gold_deposit_boost.getDetail_text();
                            if (detail_text != null) {
                                rdsDataRowView.setDescriptionText(instantTransferDetailFragment.getMarkwon().toMarkdown(detail_text));
                            }
                            ServerToBentoAssetMapper2 icon_asset = gold_deposit_boost.getIcon_asset();
                            if (icon_asset != null) {
                                Intrinsics.checkNotNull(rdsDataRowView);
                                rdsDataRowView.setValueIconRightDrawable(ViewsKt.getDrawable(rdsDataRowView, icon_asset.getResourceId()));
                            }
                            Intrinsics.checkNotNull(rdsDataRowView);
                            rdsDataRowView.setVisibility(0);
                        }
                    }
                    gracePeriodContent = paymentTransfer.getGracePeriodContent();
                    if (gracePeriodContent == null) {
                        binding.gracePeriodBanner.setVisibility(0);
                        binding.gracePeriodBanner.setContent(ComposableLambda3.composableLambdaInstance(-584320450, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment$onStart$3$1$4$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i5) {
                                if ((i5 & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-584320450, i5, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.onStart.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstantTransferDetailFragment.kt:238)");
                                }
                                this.this$0.GracePeriodContent(gracePeriodContent.getBanner_sdui(), composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        binding.gracePeriodDetails.setVisibility(0);
                        binding.gracePeriodDetails.setContent(ComposableLambda3.composableLambdaInstance(605493109, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment$onStart$3$1$4$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i5) {
                                if ((i5 & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(605493109, i5, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.onStart.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstantTransferDetailFragment.kt:243)");
                                }
                                this.this$0.GracePeriodContent(gracePeriodContent.getDetails_sdui(), composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final UIComponent<GenericAction> cta = gracePeriodContent.getCta();
                        if (cta != null) {
                            binding.gracePeriodCta.setVisibility(0);
                            binding.gracePeriodCta.setContent(ComposableLambda3.composableLambdaInstance(1373768962, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment$onStart$3$1$4$3$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i5) {
                                    if ((i5 & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1373768962, i5, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.onStart.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstantTransferDetailFragment.kt:249)");
                                    }
                                    this.this$0.GracePeriodContent(cta, composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            binding.gracePeriodBanner.setVisibility(8);
                            binding.gracePeriodDetails.setVisibility(8);
                            binding.gracePeriodCta.setVisibility(8);
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void GracePeriodContent(final UIComponent<? extends GenericAction> uIComponent, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-243171590);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uIComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-243171590, i2, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.GracePeriodContent (InstantTransferDetailFragment.kt:263)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1537425230, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.GracePeriodContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1537425230, i3, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.GracePeriodContent.<anonymous> (InstantTransferDetailFragment.kt:265)");
                    }
                    final InstantTransferDetailFragment instantTransferDetailFragment = InstantTransferDetailFragment.this;
                    final UIComponent<GenericAction> uIComponent2 = uIComponent;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(972412349, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.GracePeriodContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(972412349, i4, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.GracePeriodContent.<anonymous>.<anonymous> (InstantTransferDetailFragment.kt:266)");
                            }
                            InstantTransferDetailFragment instantTransferDetailFragment2 = instantTransferDetailFragment;
                            final UIComponent<GenericAction> uIComponent3 = uIComponent2;
                            SduiActionHandler3.ProvideActionHandler(instantTransferDetailFragment2, ComposableLambda3.rememberComposableLambda(1298118302, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.GracePeriodContent.1.1.1
                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1298118302, i5, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.GracePeriodContent.<anonymous>.<anonymous>.<anonymous> (InstantTransferDetailFragment.kt:267)");
                                    }
                                    ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(uIComponent3);
                                    composer4.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer4, 0, 0);
                                    composer4.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstantTransferDetailFragment.GracePeriodContent$lambda$14(this.f$0, uIComponent, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Dismiss) {
            requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return true;
        }
        if (action instanceof GenericAction.Deeplink) {
            return ActionHandlingFragment2.handleDeeplink$default(this, ((GenericAction.Deeplink) action).getValue2(), null, 2, null);
        }
        if (!(action instanceof GenericAction.InfoAlert)) {
            throw new NoWhenBranchMatchedException();
        }
        SduiAlertKt.presentSduiAlertSheet(this, getMarkwon(), ((GenericAction.InfoAlert) action).getValue2().getAlert(), this, (1016 & 8) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004b: INVOKE 
              (r16v0 'this' com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment A[IMMUTABLE_TYPE, THIS])
              (wrap:io.noties.markwon.Markwon:0x0031: INVOKE (r16v0 'this' com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment A[IMMUTABLE_TYPE, THIS]) VIRTUAL call: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.getMarkwon():io.noties.markwon.Markwon A[MD:():io.noties.markwon.Markwon (m), WRAPPED] (LINE:285))
              (wrap:com.robinhood.models.serverdriven.experimental.api.GenericAlertContent:0x003b: INVOKE 
              (wrap:com.robinhood.models.serverdriven.experimental.api.AlertAction:0x0037: INVOKE 
              (wrap:com.robinhood.models.serverdriven.experimental.api.GenericAction$InfoAlert:0x0035: CHECK_CAST (com.robinhood.models.serverdriven.experimental.api.GenericAction$InfoAlert) (r17v0 'action' com.robinhood.models.serverdriven.experimental.api.GenericAction))
             VIRTUAL call: com.robinhood.models.serverdriven.experimental.api.GenericAction.InfoAlert.getValue():com.robinhood.models.serverdriven.experimental.api.AlertAction A[MD:():java.lang.Object (m), WRAPPED] (LINE:286))
             VIRTUAL call: com.robinhood.models.serverdriven.experimental.api.AlertAction.getAlert():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent A[MD:():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<ActionT extends android.os.Parcelable> (m), WRAPPED] (LINE:286))
              (r16v0 'this' com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment A[IMMUTABLE_TYPE, THIS])
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0002: ARITH (1016 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:520) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (1016 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:521) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001c: ARITH (1016 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:522) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (1016 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (1016 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (1016 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:com.robinhood.android.common.ui.RhButtonType:?: TERNARY null = ((wrap:int:0x0043: ARITH (1016 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.robinhood.android.common.ui.RhButtonType) : (null com.robinhood.android.common.ui.RhButtonType))
             STATIC call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void A[MD:<ActionT extends android.os.Parcelable>:(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<? extends ActionT extends android.os.Parcelable>, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<? super ActionT extends android.os.Parcelable>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void (m)] (LINE:516) in method: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.handle(com.robinhood.models.serverdriven.experimental.api.GenericAction):boolean, file: classes10.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 27 more
            */
        /*
            this = this;
            r0 = r17
            java.lang.String r1 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            boolean r1 = r0 instanceof com.robinhood.models.serverdriven.experimental.api.GenericAction.Dismiss
            r2 = 1
            if (r1 == 0) goto L18
            androidx.fragment.app.FragmentActivity r0 = r16.requireActivity()
            androidx.activity.OnBackPressedDispatcher r0 = r0.getOnBackPressedDispatcher()
            r0.onBackPressed()
            return r2
        L18:
            boolean r1 = r0 instanceof com.robinhood.models.serverdriven.experimental.api.GenericAction.Deeplink
            if (r1 == 0) goto L2b
            com.robinhood.models.serverdriven.experimental.api.GenericAction$Deeplink r0 = (com.robinhood.models.serverdriven.experimental.api.GenericAction.Deeplink) r0
            com.robinhood.models.serverdriven.experimental.api.DeeplinkAction r0 = r0.getValue2()
            r1 = 2
            r2 = 0
            r3 = r16
            boolean r0 = com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2.handleDeeplink$default(r3, r0, r2, r1, r2)
            return r0
        L2b:
            r3 = r16
            boolean r1 = r0 instanceof com.robinhood.models.serverdriven.experimental.api.GenericAction.InfoAlert
            if (r1 == 0) goto L4f
            io.noties.markwon.Markwon r4 = r3.getMarkwon()
            com.robinhood.models.serverdriven.experimental.api.GenericAction$InfoAlert r0 = (com.robinhood.models.serverdriven.experimental.api.GenericAction.InfoAlert) r0
            com.robinhood.models.serverdriven.experimental.api.AlertAction r0 = r0.getValue2()
            com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r5 = r0.getAlert()
            r14 = 888(0x378, float:1.244E-42)
            r15 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 0
            r6 = r16
            com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        L4f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.history.p153ui.transfer.InstantTransferDetailFragment.mo15941handle(com.robinhood.models.serverdriven.experimental.api.GenericAction):boolean");
    }

    private final void handleNonReadyPendingState(FragmentDebitCardTransferDetailBinding binding, final PaymentTransfer transfer, final AchRelationship paymentInstrument) {
        binding.genericInstantContent.setVisibility(8);
        binding.composeContent.setVisibility(0);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(contextRequireContext, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        final Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(scarletContextWrapper));
        binding.composeContent.setContent(ComposableLambda3.composableLambdaInstance(-2027805105, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.handleNonReadyPendingState.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2027805105, i, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.handleNonReadyPendingState.<anonymous> (InstantTransferDetailFragment.kt:306)");
                }
                Observable<ThemesFromScarlet> observable = observableThemeChangesForCompose;
                final InstantTransferDetailFragment instantTransferDetailFragment = this;
                final PaymentTransfer paymentTransfer = transfer;
                final AchRelationship achRelationship = paymentInstrument;
                BentoTheme2.BentoTheme(observable, null, ComposableLambda3.rememberComposableLambda(1719705181, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.handleNonReadyPendingState.1.1

                    /* compiled from: InstantTransferDetailFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment$handleNonReadyPendingState$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C501821 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ AchRelationship $paymentInstrument;
                        final /* synthetic */ PaymentTransfer $transfer;
                        final /* synthetic */ InstantTransferDetailFragment this$0;

                        C501821(InstantTransferDetailFragment instantTransferDetailFragment, PaymentTransfer paymentTransfer, AchRelationship achRelationship) {
                            this.this$0 = instantTransferDetailFragment;
                            this.$transfer = paymentTransfer;
                            this.$paymentInstrument = achRelationship;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-776161806, i, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.handleNonReadyPendingState.<anonymous>.<anonymous>.<anonymous> (InstantTransferDetailFragment.kt:308)");
                            }
                            RfpDetailDataCreator rfpDetailDataCreator = RfpDetailDataCreator.INSTANCE;
                            Context contextRequireContext = this.this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            PaymentTransfer paymentTransfer = this.$transfer;
                            AchRelationship achRelationship = this.$paymentInstrument;
                            Resources resources = this.this$0.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$transfer) | composer.changedInstance(this.this$0);
                            final PaymentTransfer paymentTransfer2 = this.$transfer;
                            final InstantTransferDetailFragment instantTransferDetailFragment = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment$handleNonReadyPendingState$1$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InstantTransferDetailFragment.C184431.AnonymousClass1.C501821.invoke$lambda$2$lambda$1(paymentTransfer2, instantTransferDetailFragment);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            RfpInstantTransferNonReadyPendingPage2.RfpInstantTransferNonReadyPendingPage(RfpDetailDataCreator.getNonReadyPendingStateDisplayData$default(rfpDetailDataCreator, contextRequireContext, paymentTransfer, achRelationship, resources, (Function0) objRememberedValue, false, 32, null), null, composer, 0, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(PaymentTransfer paymentTransfer, InstantTransferDetailFragment instantTransferDetailFragment) {
                            ApiPaymentTransferDetails details = paymentTransfer.getDetails();
                            ApiPaymentTransferDetails.ApiInstantBankTransfer apiInstantBankTransfer = details instanceof ApiPaymentTransferDetails.ApiInstantBankTransfer ? (ApiPaymentTransferDetails.ApiInstantBankTransfer) details : null;
                            if (apiInstantBankTransfer != null) {
                                Navigator navigator = instantTransferDetailFragment.getNavigator();
                                Context contextRequireContext = instantTransferDetailFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                LegacyDetailFragmentKey.Companion companion = LegacyDetailFragmentKey.INSTANCE;
                                DetailType detailType = DetailType.INSTANT_BANK_TRANSFER;
                                UUID uuidFromString = UUID.fromString(apiInstantBankTransfer.getSource_transfer_id());
                                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, LegacyDetailFragmentKey.Companion.from$default(companion, detailType, uuidFromString, null, false, 12, null), false, false, false, false, null, false, null, null, 1020, null);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1719705181, i2, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.handleNonReadyPendingState.<anonymous>.<anonymous> (InstantTransferDetailFragment.kt:307)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-776161806, true, new C501821(instantTransferDetailFragment, paymentTransfer, achRelationship), composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    private final void handleNewReadyPendingState(FragmentDebitCardTransferDetailBinding binding, final PaymentTransfer transfer, final AchRelationship paymentInstrument) {
        binding.genericInstantContent.setVisibility(8);
        binding.composeContent.setVisibility(0);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(contextRequireContext, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        final Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(scarletContextWrapper));
        binding.composeContent.setContent(ComposableLambda3.composableLambdaInstance(-2088173220, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.handleNewReadyPendingState.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2088173220, i, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.handleNewReadyPendingState.<anonymous> (InstantTransferDetailFragment.kt:344)");
                }
                Observable<ThemesFromScarlet> observable = observableThemeChangesForCompose;
                final PaymentTransfer paymentTransfer = transfer;
                final AchRelationship achRelationship = paymentInstrument;
                final InstantTransferDetailFragment instantTransferDetailFragment = this;
                BentoTheme2.BentoTheme(observable, null, ComposableLambda3.rememberComposableLambda(1659337066, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.handleNewReadyPendingState.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1659337066, i2, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.handleNewReadyPendingState.<anonymous>.<anonymous> (InstantTransferDetailFragment.kt:345)");
                        }
                        final PaymentTransfer paymentTransfer2 = paymentTransfer;
                        final AchRelationship achRelationship2 = achRelationship;
                        final InstantTransferDetailFragment instantTransferDetailFragment2 = instantTransferDetailFragment;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-836529921, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.handleNewReadyPendingState.1.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-836529921, i3, -1, "com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment.handleNewReadyPendingState.<anonymous>.<anonymous>.<anonymous> (InstantTransferDetailFragment.kt:346)");
                                }
                                RfpDetailDataCreator rfpDetailDataCreator = RfpDetailDataCreator.INSTANCE;
                                PaymentTransfer paymentTransfer3 = paymentTransfer2;
                                AchRelationship achRelationship3 = achRelationship2;
                                Resources resources = instantTransferDetailFragment2.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i4 = BentoTheme.$stable;
                                RfpTimelineInstantTransferDetailComponent2.RfpTimelineInstantTransferDetailComponent(rfpDetailDataCreator.m15251getDisplayData15ZiRo(paymentTransfer3, achRelationship3, resources, bentoTheme.getColors(composer3, i4).getC8(), bentoTheme.getColors(composer3, i4).m21373getBg30d7_KjU(), bentoTheme.getColors(composer3, i4).getSolLight()), null, composer3, 0, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* compiled from: InstantTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/transfer/InstantTransferDetailFragment$Args;", "Landroid/os/Parcelable;", "instantTransferId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstantTransferId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID instantTransferId;

        /* compiled from: InstantTransferDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instantTransferId);
        }

        public Args(UUID instantTransferId) {
            Intrinsics.checkNotNullParameter(instantTransferId, "instantTransferId");
            this.instantTransferId = instantTransferId;
        }

        public final UUID getInstantTransferId() {
            return this.instantTransferId;
        }
    }

    /* compiled from: InstantTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/transfer/InstantTransferDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/history/ui/transfer/InstantTransferDetailFragment;", "Lcom/robinhood/android/history/ui/transfer/InstantTransferDetailFragment$Args;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InstantTransferDetailFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InstantTransferDetailFragment instantTransferDetailFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, instantTransferDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InstantTransferDetailFragment newInstance(Args args) {
            return (InstantTransferDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InstantTransferDetailFragment instantTransferDetailFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, instantTransferDetailFragment, args);
        }
    }
}
