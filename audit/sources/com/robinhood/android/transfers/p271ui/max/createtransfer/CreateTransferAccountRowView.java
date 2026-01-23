package com.robinhood.android.transfers.p271ui.max.createtransfer;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.jakewharton.rxrelay2.PublishRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.transfers.util.TransferAccounts2;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.databinding.MergeCreateTransferAccountRowViewBinding;
import com.robinhood.android.transfers.lib.TransferAccounts4;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.SelectTransferAccountBundle;
import com.robinhood.android.transfers.p271ui.max.createtransfer.ValueTextState;
import com.robinhood.android.transfers.util.TransferAccounts6;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.librobinhood.data.store.bonfire.TransferLimitsStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFee;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams3;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeResponse;
import com.robinhood.models.api.bonfire.transfer.Discount;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.LimitsInterval;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Singles;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTransferAccountRowView.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 B2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002ABB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0003H\u0002J\b\u0010=\u001a\u00020>H\u0014J\u0010\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00030\u00030)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010+\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010,0,0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010.0.0)X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010/\u001a&\u0012\f\u0012\n **\u0004\u0018\u00010,0, **\u0012\u0012\f\u0012\n **\u0004\u0018\u00010,0,\u0018\u00010000¢\u0006\b\n\u0000\u001a\u0004\b/\u00101R5\u00102\u001a&\u0012\f\u0012\n **\u0004\u0018\u00010.0. **\u0012\u0012\f\u0012\n **\u0004\u0018\u00010.0.\u0018\u00010000¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/CreateTransferAccountRowView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/transfers/ui/max/SelectTransferAccountBundle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/transfers/databinding/MergeCreateTransferAccountRowViewBinding;", "getBinding", "()Lcom/robinhood/android/transfers/databinding/MergeCreateTransferAccountRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "getTransfersBonfireApi", "()Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "setTransfersBonfireApi", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;)V", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsStore;", "getTransferLimitsStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsStore;", "setTransferLimitsStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsStore;)V", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "setMoshi", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", "selectTransferAccountBundleRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "kotlin.jvm.PlatformType", "isLoadingRelay", "", "transferConstraintsRelay", "Lcom/robinhood/android/transfers/ui/max/createtransfer/TransferConstraints;", "isLoadingStream", "Lio/reactivex/Observable;", "()Lio/reactivex/Observable;", "serviceFeeStream", "getServiceFeeStream", "callbacks", "Lcom/robinhood/android/transfers/ui/max/createtransfer/CreateTransferAccountRowView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/max/createtransfer/CreateTransferAccountRowView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/transfers/ui/max/createtransfer/CreateTransferAccountRowView$Callbacks;)V", "getDefaultLoaded", "Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState$DefaultLoaded;", "selectTransferAccountBundle", "onAttachedToWindow", "", "bind", "state", "Callbacks", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateTransferAccountRowView extends Hammer_CreateTransferAccountRowView implements Bindable<SelectTransferAccountBundle> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    private final PublishRelay<Boolean> isLoadingRelay;
    private final Observable<Boolean> isLoadingStream;
    public LazyMoshi moshi;
    public RxFactory rxFactory;
    private final PublishRelay<SelectTransferAccountBundle> selectTransferAccountBundleRelay;
    private final Observable<TransferConstraints> serviceFeeStream;
    private final PublishRelay<TransferConstraints> transferConstraintsRelay;
    public TransferLimitsStore transferLimitsStore;
    public TransfersBonfireApi transfersBonfireApi;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreateTransferAccountRowView.class, "binding", "getBinding()Lcom/robinhood/android/transfers/databinding/MergeCreateTransferAccountRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CreateTransferAccountRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/CreateTransferAccountRowView$Callbacks;", "", "onContentFailure", "", "throwable", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContentFailure(Throwable throwable);
    }

    /* compiled from: CreateTransferAccountRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferAccountDirection.values().length];
            try {
                iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CreateTransferAccountRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTransferAccountRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, CreateTransferAccountRowView2.INSTANCE);
        ViewGroups.inflate(this, C30065R.layout.merge_create_transfer_account_row_view, true);
        setOrientation(1);
        PublishRelay<SelectTransferAccountBundle> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.selectTransferAccountBundleRelay = publishRelayCreate;
        PublishRelay<Boolean> publishRelayCreate2 = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate2, "create(...)");
        this.isLoadingRelay = publishRelayCreate2;
        PublishRelay<TransferConstraints> publishRelayCreate3 = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate3, "create(...)");
        this.transferConstraintsRelay = publishRelayCreate3;
        this.isLoadingStream = publishRelayCreate2.hide().distinctUntilChanged().subscribeOn(Schedulers.m3346io());
        this.serviceFeeStream = publishRelayCreate3.distinctUntilChanged().subscribeOn(Schedulers.m3346io());
    }

    private final MergeCreateTransferAccountRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeCreateTransferAccountRowViewBinding) value;
    }

    public final TransfersBonfireApi getTransfersBonfireApi() {
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
        if (transfersBonfireApi != null) {
            return transfersBonfireApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transfersBonfireApi");
        return null;
    }

    public final void setTransfersBonfireApi(TransfersBonfireApi transfersBonfireApi) {
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "<set-?>");
        this.transfersBonfireApi = transfersBonfireApi;
    }

    public final TransferLimitsStore getTransferLimitsStore() {
        TransferLimitsStore transferLimitsStore = this.transferLimitsStore;
        if (transferLimitsStore != null) {
            return transferLimitsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transferLimitsStore");
        return null;
    }

    public final void setTransferLimitsStore(TransferLimitsStore transferLimitsStore) {
        Intrinsics.checkNotNullParameter(transferLimitsStore, "<set-?>");
        this.transferLimitsStore = transferLimitsStore;
    }

    public final LazyMoshi getMoshi() {
        LazyMoshi lazyMoshi = this.moshi;
        if (lazyMoshi != null) {
            return lazyMoshi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("moshi");
        return null;
    }

    public final void setMoshi(LazyMoshi lazyMoshi) {
        Intrinsics.checkNotNullParameter(lazyMoshi, "<set-?>");
        this.moshi = lazyMoshi;
    }

    public final RxFactory getRxFactory() {
        RxFactory rxFactory = this.rxFactory;
        if (rxFactory != null) {
            return rxFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxFactory");
        return null;
    }

    public final void setRxFactory(RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(rxFactory, "<set-?>");
        this.rxFactory = rxFactory;
    }

    public final Observable<Boolean> isLoadingStream() {
        return this.isLoadingStream;
    }

    public final Observable<TransferConstraints> getServiceFeeStream() {
        return this.serviceFeeStream;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueTextState.DefaultLoaded getDefaultLoaded(SelectTransferAccountBundle selectTransferAccountBundle) {
        return new ValueTextState.DefaultLoaded(selectTransferAccountBundle.getSelectedAccount(), selectTransferAccountBundle.getOtherAccount(), selectTransferAccountBundle.getDirection(), selectTransferAccountBundle.getIraContributionType(), selectTransferAccountBundle.isInInterEntityMatchExperiment(), selectTransferAccountBundle.isOutgoingWire());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable observableDoOnNext = this.selectTransferAccountBundleRelay.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView.onAttachedToWindow.1

            /* compiled from: CreateTransferAccountRowView.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$onAttachedToWindow$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CreateTransferViewState.Mode.values().length];
                    try {
                        iArr[CreateTransferViewState.Mode.EDIT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CreateTransferViewState.Mode.REVIEW.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ValueTextState> apply(final SelectTransferAccountBundle selectTransferAccountBundle) {
                Observable<R> observableJust;
                Single<R> singleJust;
                Intrinsics.checkNotNullParameter(selectTransferAccountBundle, "selectTransferAccountBundle");
                int i = WhenMappings.$EnumSwitchMapping$0[selectTransferAccountBundle.getMode().ordinal()];
                if (i == 1) {
                    TransferAccount sourceAccount = selectTransferAccountBundle.getSourceAccount();
                    ApiTransferAccount.TransferAccountType type2 = sourceAccount != null ? sourceAccount.getType() : null;
                    TransferAccount sinkAccount = selectTransferAccountBundle.getSinkAccount();
                    ApiTransferAccount.TransferAccountType type3 = sinkAccount != null ? sinkAccount.getType() : null;
                    if (type2 == null || type3 == null || selectTransferAccountBundle.isOutgoingWire()) {
                        observableJust = Observable.just(CreateTransferAccountRowView.this.getDefaultLoaded(selectTransferAccountBundle));
                    } else {
                        Single singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(CreateTransferAccountRowView.this.getRxFactory(), null, new AnonymousClass1(CreateTransferAccountRowView.this, type2, type3, null), 1, null);
                        final CreateTransferAccountRowView createTransferAccountRowView = CreateTransferAccountRowView.this;
                        observableJust = singleRxSingle$default.map(new Function() { // from class: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView.onAttachedToWindow.1.2

                            /* compiled from: CreateTransferAccountRowView.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$onAttachedToWindow$1$2$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[TransferAccountDirection.values().length];
                                    try {
                                        iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[TransferAccountDirection.SINK.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            @Override // io.reactivex.functions.Function
                            public final ValueTextState apply(ApiServiceFeeParams it) {
                                ApiServiceFee pull;
                                Intrinsics.checkNotNullParameter(it, "it");
                                int i2 = WhenMappings.$EnumSwitchMapping$0[selectTransferAccountBundle.getDirection().ordinal()];
                                if (i2 == 1) {
                                    pull = it.getPull();
                                } else {
                                    if (i2 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pull = it.getPush();
                                }
                                List<Discount> discountDetails = pull.getDiscountDetails();
                                Discount discount = discountDetails != null ? (Discount) CollectionsKt.firstOrNull((List) discountDetails) : null;
                                if (discount != null) {
                                    ApiServiceFeeParams3 discountScheme = discount.getDiscountScheme();
                                    if (selectTransferAccountBundle.getDirection() == TransferAccountDirection.SINK && discountScheme == ApiServiceFeeParams3.P2P_DISCOUNTED_INSTANT_WITHDRAWAL && selectTransferAccountBundle.getSelectedAccount() != null) {
                                        TransferAccountDirection direction = selectTransferAccountBundle.getDirection();
                                        TransferAccount selectedAccount = selectTransferAccountBundle.getSelectedAccount();
                                        Intrinsics.checkNotNull(selectedAccount);
                                        TransferAccount otherAccount = selectTransferAccountBundle.getOtherAccount();
                                        boolean zIsInInterEntityMatchExperiment = selectTransferAccountBundle.isInInterEntityMatchExperiment();
                                        ApiTransferAccount.TransferAccountType type4 = null;
                                        MatchaCreateTransferAccountRowViewMapper matchaCreateTransferAccountRowViewMapper = MatchaCreateTransferAccountRowViewMapper.INSTANCE;
                                        Context context = createTransferAccountRowView.getContext();
                                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                        TransferAccountDirection direction2 = selectTransferAccountBundle.getDirection();
                                        TransferAccount selectedAccount2 = selectTransferAccountBundle.getSelectedAccount();
                                        if (selectedAccount2 != null) {
                                            type4 = selectedAccount2.getType();
                                        }
                                        return new ValueTextState.WithdrawalWithFees(selectedAccount, otherAccount, direction, null, null, zIsInInterEntityMatchExperiment, matchaCreateTransferAccountRowViewMapper.getMatchaDisplayInfo(context, direction2, type4, it, false, null));
                                    }
                                    CreateTransferAccountRowView createTransferAccountRowView2 = createTransferAccountRowView;
                                    SelectTransferAccountBundle selectTransferAccountBundle2 = selectTransferAccountBundle;
                                    Intrinsics.checkNotNull(selectTransferAccountBundle2);
                                    return createTransferAccountRowView2.getDefaultLoaded(selectTransferAccountBundle2);
                                }
                                CreateTransferAccountRowView createTransferAccountRowView3 = createTransferAccountRowView;
                                SelectTransferAccountBundle selectTransferAccountBundle3 = selectTransferAccountBundle;
                                Intrinsics.checkNotNull(selectTransferAccountBundle3);
                                return createTransferAccountRowView3.getDefaultLoaded(selectTransferAccountBundle3);
                            }
                        }).toObservable();
                    }
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (selectTransferAccountBundle.getDirection() != TransferAccountDirection.SINK || selectTransferAccountBundle.getSinkAccount() == null || selectTransferAccountBundle.getSourceAccount() == null || selectTransferAccountBundle.isOutgoingWire() || (!TransferAccounts2.isRtpEligible(selectTransferAccountBundle.getSinkAccount()) ? !selectTransferAccountBundle.getSinkAccount().getHasWithdrawalFee() : !TransferAccounts2.isRtpEligibleSource(selectTransferAccountBundle.getSourceAccount()))) {
                        return Observable.just(new ValueTextState.DefaultLoaded(selectTransferAccountBundle.getSelectedAccount(), selectTransferAccountBundle.getOtherAccount(), selectTransferAccountBundle.getDirection(), selectTransferAccountBundle.getIraContributionType(), selectTransferAccountBundle.isInInterEntityMatchExperiment(), selectTransferAccountBundle.isOutgoingWire()));
                    }
                    BigDecimal amount = selectTransferAccountBundle.getAmount();
                    if (amount.compareTo(BigDecimal.ZERO) <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    Singles singles = Singles.INSTANCE;
                    Single singleRxSingle$default2 = RxFactory.DefaultImpls.rxSingle$default(CreateTransferAccountRowView.this.getRxFactory(), null, new AnonymousClass3(CreateTransferAccountRowView.this, amount, selectTransferAccountBundle, null), 1, null);
                    if (TransferAccounts2.isRtpEligibleSource(selectTransferAccountBundle.getSourceAccount()) && selectTransferAccountBundle.getSinkAccount().getType() == ApiTransferAccount.TransferAccountType.ACH && TransferAccounts2.isRtpEligible(selectTransferAccountBundle.getSinkAccount())) {
                        singleJust = RxFactory.DefaultImpls.rxSingle$default(CreateTransferAccountRowView.this.getRxFactory(), null, new AnonymousClass4(CreateTransferAccountRowView.this, null), 1, null).map(new Function() { // from class: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView.onAttachedToWindow.1.5
                            @Override // io.reactivex.functions.Function
                            public final Optional<ApiAmountLimit> apply(ApiLimitsHubResponse response) {
                                Intrinsics.checkNotNullParameter(response, "response");
                                List<ApiAmountLimit> amount_limits = response.getAmount_limits();
                                ApiAmountLimit apiAmountLimit = null;
                                if (amount_limits != null) {
                                    Iterator<T> it = amount_limits.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        T next = it.next();
                                        if (((ApiAmountLimit) next).getLimits_interval() == LimitsInterval.DAILY) {
                                            apiAmountLimit = next;
                                            break;
                                        }
                                    }
                                    apiAmountLimit = apiAmountLimit;
                                }
                                return Optional3.asOptional(apiAmountLimit);
                            }
                        }).onErrorResumeNext(new Function() { // from class: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView.onAttachedToWindow.1.6
                            @Override // io.reactivex.functions.Function
                            public final SingleSource<? extends Optional<ApiAmountLimit>> apply(Throwable t) {
                                Intrinsics.checkNotNullParameter(t, "t");
                                if (Throwables.isNetworkRelated(t)) {
                                    return Single.just(Optional2.INSTANCE);
                                }
                                return Single.error(t);
                            }
                        });
                    } else {
                        singleJust = Single.just(Optional2.INSTANCE);
                    }
                    Intrinsics.checkNotNull(singleJust);
                    Single singleZip = singles.zip(singleRxSingle$default2, singleJust, RxFactory.DefaultImpls.rxSingle$default(CreateTransferAccountRowView.this.getRxFactory(), null, new AnonymousClass7(CreateTransferAccountRowView.this, selectTransferAccountBundle, null), 1, null));
                    final CreateTransferAccountRowView createTransferAccountRowView2 = CreateTransferAccountRowView.this;
                    Observable<R> observable = singleZip.map(new Function() { // from class: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView.onAttachedToWindow.1.8
                        @Override // io.reactivex.functions.Function
                        public final ValueTextState apply(Tuples3<ApiServiceFeeResponse, ? extends Optional<ApiAmountLimit>, ApiServiceFeeParams> tuples3) {
                            Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                            ApiServiceFeeResponse apiServiceFeeResponseComponent1 = tuples3.component1();
                            Optional<ApiAmountLimit> optionalComponent2 = tuples3.component2();
                            ApiServiceFeeParams apiServiceFeeParamsComponent3 = tuples3.component3();
                            TransferAccount selectedAccount = selectTransferAccountBundle.getSelectedAccount();
                            Intrinsics.checkNotNull(selectedAccount);
                            TransferAccount otherAccount = selectTransferAccountBundle.getOtherAccount();
                            TransferAccountDirection direction = selectTransferAccountBundle.getDirection();
                            ApiAmountLimit orNull = optionalComponent2.getOrNull();
                            boolean zIsInInterEntityMatchExperiment = selectTransferAccountBundle.isInInterEntityMatchExperiment();
                            MatchaCreateTransferAccountRowViewMapper matchaCreateTransferAccountRowViewMapper = MatchaCreateTransferAccountRowViewMapper.INSTANCE;
                            Context context = createTransferAccountRowView2.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            TransferAccountDirection direction2 = selectTransferAccountBundle.getDirection();
                            ApiTransferAccount.TransferAccountType type4 = selectTransferAccountBundle.getSinkAccount().getType();
                            Intrinsics.checkNotNull(apiServiceFeeParamsComponent3);
                            return new ValueTextState.WithdrawalWithFees(selectedAccount, otherAccount, direction, apiServiceFeeResponseComponent1, orNull, zIsInInterEntityMatchExperiment, matchaCreateTransferAccountRowViewMapper.getMatchaDisplayInfo(context, direction2, type4, apiServiceFeeParamsComponent3, true, apiServiceFeeResponseComponent1));
                        }
                    }).onErrorReturn(new Function() { // from class: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView.onAttachedToWindow.1.9
                        @Override // io.reactivex.functions.Function
                        public final ValueTextState apply(Throwable throwable) {
                            Intrinsics.checkNotNullParameter(throwable, "throwable");
                            TransferAccount selectedAccount = selectTransferAccountBundle.getSelectedAccount();
                            Intrinsics.checkNotNull(selectedAccount);
                            return new ValueTextState.Error(selectedAccount, selectTransferAccountBundle.getOtherAccount(), selectTransferAccountBundle.getDirection(), selectTransferAccountBundle.isInInterEntityMatchExperiment(), throwable);
                        }
                    }).toObservable();
                    TransferAccount selectedAccount = selectTransferAccountBundle.getSelectedAccount();
                    Intrinsics.checkNotNull(selectedAccount);
                    observableJust = observable.startWith((Observable<R>) new ValueTextState.Loading(selectedAccount, selectTransferAccountBundle.getOtherAccount(), selectTransferAccountBundle.getDirection(), selectTransferAccountBundle.isInInterEntityMatchExperiment()));
                }
                return observableJust.subscribeOn(Schedulers.m3346io());
            }

            /* compiled from: CreateTransferAccountRowView.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$onAttachedToWindow$1$1", m3645f = "CreateTransferAccountRowView.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$onAttachedToWindow$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiServiceFeeParams>, Object> {
                final /* synthetic */ ApiTransferAccount.TransferAccountType $sinkAccountType;
                final /* synthetic */ ApiTransferAccount.TransferAccountType $sourceAccountType;
                int label;
                final /* synthetic */ CreateTransferAccountRowView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CreateTransferAccountRowView createTransferAccountRowView, ApiTransferAccount.TransferAccountType transferAccountType, ApiTransferAccount.TransferAccountType transferAccountType2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = createTransferAccountRowView;
                    this.$sourceAccountType = transferAccountType;
                    this.$sinkAccountType = transferAccountType2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$sourceAccountType, this.$sinkAccountType, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiServiceFeeParams> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    TransfersBonfireApi transfersBonfireApi = this.this$0.getTransfersBonfireApi();
                    TransferType transferType = TransferType.DEBIT_CARD_TRANSFER;
                    ApiTransferAccount.TransferAccountType transferAccountType = this.$sourceAccountType;
                    ApiTransferAccount.TransferAccountType transferAccountType2 = this.$sinkAccountType;
                    this.label = 1;
                    Object serviceFeeParams = transfersBonfireApi.getServiceFeeParams(transferType, transferAccountType, transferAccountType2, this);
                    return serviceFeeParams == coroutine_suspended ? coroutine_suspended : serviceFeeParams;
                }
            }

            /* compiled from: CreateTransferAccountRowView.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$onAttachedToWindow$1$3", m3645f = "CreateTransferAccountRowView.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$onAttachedToWindow$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiServiceFeeResponse>, Object> {
                final /* synthetic */ BigDecimal $amount;
                final /* synthetic */ SelectTransferAccountBundle $selectTransferAccountBundle;
                int label;
                final /* synthetic */ CreateTransferAccountRowView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(CreateTransferAccountRowView createTransferAccountRowView, BigDecimal bigDecimal, SelectTransferAccountBundle selectTransferAccountBundle, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = createTransferAccountRowView;
                    this.$amount = bigDecimal;
                    this.$selectTransferAccountBundle = selectTransferAccountBundle;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(this.this$0, this.$amount, this.$selectTransferAccountBundle, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiServiceFeeResponse> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    TransfersBonfireApi transfersBonfireApi = this.this$0.getTransfersBonfireApi();
                    LazyMoshi moshi = this.this$0.getMoshi();
                    Types types = Types.INSTANCE;
                    String json = moshi.adapter(new TypeToken<Money>() { // from class: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$onAttachedToWindow$1$3$invokeSuspend$$inlined$getAdapter$1
                    }.getType()).toJson(Money3.toMoney(this.$amount, Currencies.USD));
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    ApiTransferAccount.TransferAccountType type2 = this.$selectTransferAccountBundle.getSourceAccount().getType();
                    ApiTransferAccount.TransferAccountType type3 = this.$selectTransferAccountBundle.getSinkAccount().getType();
                    this.label = 1;
                    Object serviceFee$default = TransfersBonfireApi.DefaultImpls.getServiceFee$default(transfersBonfireApi, json, type2, type3, null, this, 8, null);
                    return serviceFee$default == coroutine_suspended ? coroutine_suspended : serviceFee$default;
                }
            }

            /* compiled from: CreateTransferAccountRowView.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiLimitsHubResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$onAttachedToWindow$1$4", m3645f = "CreateTransferAccountRowView.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$onAttachedToWindow$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiLimitsHubResponse>, Object> {
                int label;
                final /* synthetic */ CreateTransferAccountRowView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(CreateTransferAccountRowView createTransferAccountRowView, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = createTransferAccountRowView;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiLimitsHubResponse> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    TransferLimitsStore transferLimitsStore = this.this$0.getTransferLimitsStore();
                    TransferDirection transferDirection = TransferDirection.WITHDRAW;
                    TransferProductType transferProductType = TransferProductType.INSTANT_BANK_TRANSFER;
                    this.label = 1;
                    Object transferLimits = transferLimitsStore.getTransferLimits(transferDirection, transferProductType, this);
                    return transferLimits == coroutine_suspended ? coroutine_suspended : transferLimits;
                }
            }

            /* compiled from: CreateTransferAccountRowView.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$onAttachedToWindow$1$7", m3645f = "CreateTransferAccountRowView.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$onAttachedToWindow$1$7, reason: invalid class name */
            static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiServiceFeeParams>, Object> {
                final /* synthetic */ SelectTransferAccountBundle $selectTransferAccountBundle;
                int label;
                final /* synthetic */ CreateTransferAccountRowView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass7(CreateTransferAccountRowView createTransferAccountRowView, SelectTransferAccountBundle selectTransferAccountBundle, Continuation<? super AnonymousClass7> continuation) {
                    super(2, continuation);
                    this.this$0 = createTransferAccountRowView;
                    this.$selectTransferAccountBundle = selectTransferAccountBundle;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass7(this.this$0, this.$selectTransferAccountBundle, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiServiceFeeParams> continuation) {
                    return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    TransfersBonfireApi transfersBonfireApi = this.this$0.getTransfersBonfireApi();
                    TransferType transferType = TransferType.DEBIT_CARD_TRANSFER;
                    ApiTransferAccount.TransferAccountType type2 = this.$selectTransferAccountBundle.getSourceAccount().getType();
                    ApiTransferAccount.TransferAccountType type3 = this.$selectTransferAccountBundle.getSinkAccount().getType();
                    this.label = 1;
                    Object serviceFeeParams = transfersBonfireApi.getServiceFeeParams(transferType, type2, type3, this);
                    return serviceFeeParams == coroutine_suspended ? coroutine_suspended : serviceFeeParams;
                }
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView.onAttachedToWindow.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ValueTextState valueTextState) {
                CreateTransferAccountRowView.this.isLoadingRelay.accept(Boolean.valueOf(valueTextState.getIsLoading()));
                CreateTransferAccountRowView.this.transferConstraintsRelay.accept(new TransferConstraints(valueTextState.getServiceFee(), valueTextState.getDailyLimits()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDoOnNext), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferAccountRowView.onAttachedToWindow$lambda$1(this.f$0, (ValueTextState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(CreateTransferAccountRowView createTransferAccountRowView, ValueTextState valueTextState) {
        Callbacks callbacks;
        MergeCreateTransferAccountRowViewBinding binding = createTransferAccountRowView.getBinding();
        ValueTextState.WithdrawalWithFees withdrawalWithFees = valueTextState instanceof ValueTextState.WithdrawalWithFees ? (ValueTextState.WithdrawalWithFees) valueTextState : null;
        MatchaDisplayInfo matchaDisplayInfo = withdrawalWithFees != null ? withdrawalWithFees.getMatchaDisplayInfo() : null;
        RhTextView valueText = binding.valueText;
        Intrinsics.checkNotNullExpressionValue(valueText, "valueText");
        TransferAccount selectedAccount = valueTextState.getSelectedAccount();
        Context context = createTransferAccountRowView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextViewsKt.setVisibilityText(valueText, TransferAccounts6.getValueText(selectedAccount, context, valueTextState.getOtherAccount(), valueTextState.getDirection(), valueTextState.getServiceFee(), valueTextState.getIraContributionType(), valueTextState.getIsInInterEntityMatchExperiment(), valueTextState.getIsOutgoingWire(), matchaDisplayInfo));
        if ((valueTextState instanceof ValueTextState.Error) && (callbacks = createTransferAccountRowView.callbacks) != null) {
            callbacks.onContentFailure(((ValueTextState.Error) valueTextState).getThrowable());
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(SelectTransferAccountBundle state) {
        int i;
        Intrinsics.checkNotNullParameter(state, "state");
        MergeCreateTransferAccountRowViewBinding binding = getBinding();
        RhTextView headerText = binding.headerText;
        Intrinsics.checkNotNullExpressionValue(headerText, "headerText");
        int i2 = WhenMappings.$EnumSwitchMapping$0[state.getDirection().ordinal()];
        if (i2 == 1) {
            i = C11048R.string.general_label_from;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C11048R.string.general_label_to;
        }
        TextViewsKt.setVisibilityText(headerText, ViewsKt.getString(this, i));
        RhTextView labelText = binding.labelText;
        Intrinsics.checkNotNullExpressionValue(labelText, "labelText");
        StringResource labelText2 = TransferAccounts4.getLabelText(state.getSelectedAccount());
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        TextViewsKt.setVisibilityText(labelText, labelText2.getText(resources));
        ImageView accountRowLockIcon = binding.accountRowLockIcon;
        Intrinsics.checkNotNullExpressionValue(accountRowLockIcon, "accountRowLockIcon");
        accountRowLockIcon.setVisibility(state.getLocked() ? 0 : 8);
        this.selectTransferAccountBundleRelay.accept(state);
    }

    /* compiled from: CreateTransferAccountRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/CreateTransferAccountRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/transfers/ui/max/createtransfer/CreateTransferAccountRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CreateTransferAccountRowView> {
        private final /* synthetic */ Inflater<CreateTransferAccountRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CreateTransferAccountRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CreateTransferAccountRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C30065R.layout.include_create_transfer_account_row_view);
        }
    }
}
