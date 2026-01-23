package com.robinhood.shared.posttransfer;

import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferAmountPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferIdPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferTimestampPref;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.serverdriven.p347db.StandardRow;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.posttransfer.databinding.FragmentTransferDetailConfirmationBinding;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.Instant;

/* compiled from: TransferDetailConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 52\u00020\u0001:\u000245B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferDetailConfirmationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "getGoldDepositBoostTransferIdPref$annotations", "getGoldDepositBoostTransferIdPref", "()Lcom/robinhood/prefs/StringPreference;", "setGoldDepositBoostTransferIdPref", "(Lcom/robinhood/prefs/StringPreference;)V", "goldDepositBoostTransferAmountPref", "getGoldDepositBoostTransferAmountPref$annotations", "getGoldDepositBoostTransferAmountPref", "setGoldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "getGoldDepositBoostTransferTimestampPref$annotations", "getGoldDepositBoostTransferTimestampPref", "setGoldDepositBoostTransferTimestampPref", "binding", "Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferDetailConfirmationBinding;", "getBinding", "()Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferDetailConfirmationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/shared/posttransfer/TransferDetailConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/posttransfer/TransferDetailConfirmationFragment$Callbacks;", "callbacks$delegate", "itemsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "Lcom/robinhood/models/serverdriven/db/StandardRow;", "additionalTextAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "Landroid/text/Spanned;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TransferDetailConfirmationFragment extends BaseFragment {
    private final SingleItemAdapter<RhTextView, Spanned> additionalTextAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final CompositeAdapter compositeAdapter;
    public StringPreference goldDepositBoostTransferAmountPref;
    public StringPreference goldDepositBoostTransferIdPref;
    public StringPreference goldDepositBoostTransferTimestampPref;
    private final GenericListAdapter<RdsDataRowView, StandardRow> itemsAdapter;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransferDetailConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferDetailConfirmationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(TransferDetailConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/posttransfer/TransferDetailConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TransferDetailConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferDetailConfirmationFragment$Callbacks;", "", "onContinueClick", "", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueClick();
    }

    @GoldDepositBoostTransferAmountPref
    public static /* synthetic */ void getGoldDepositBoostTransferAmountPref$annotations() {
    }

    @GoldDepositBoostTransferIdPref
    public static /* synthetic */ void getGoldDepositBoostTransferIdPref$annotations() {
    }

    @GoldDepositBoostTransferTimestampPref
    public static /* synthetic */ void getGoldDepositBoostTransferTimestampPref$annotations() {
    }

    public TransferDetailConfirmationFragment() {
        super(C39496R.layout.fragment_transfer_detail_confirmation);
        this.binding = ViewBinding5.viewBinding(this, TransferDetailConfirmationFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.posttransfer.TransferDetailConfirmationFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsDataRowView.Companion companion2 = RdsDataRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        GenericListAdapter<RdsDataRowView, StandardRow> genericListAdapterM2987of = companion.m2987of(companion2, equality, new Function2() { // from class: com.robinhood.shared.posttransfer.TransferDetailConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TransferDetailConfirmationFragment.itemsAdapter$lambda$0((RdsDataRowView) obj, (StandardRow) obj2);
            }
        });
        this.itemsAdapter = genericListAdapterM2987of;
        SingleItemAdapter<RhTextView, Spanned> singleItemAdapterM2991of = SingleItemAdapter.INSTANCE.m2991of(C39496R.layout.include_transfer_detail_confirmation_additional_text, equality, new Function2() { // from class: com.robinhood.shared.posttransfer.TransferDetailConfirmationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TransferDetailConfirmationFragment.additionalTextAdapter$lambda$3(this.f$0, (RhTextView) obj, (Spanned) obj2);
            }
        });
        this.additionalTextAdapter = singleItemAdapterM2991of;
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{genericListAdapterM2987of, singleItemAdapterM2991of});
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

    public final StringPreference getGoldDepositBoostTransferIdPref() {
        StringPreference stringPreference = this.goldDepositBoostTransferIdPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositBoostTransferIdPref");
        return null;
    }

    public final void setGoldDepositBoostTransferIdPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.goldDepositBoostTransferIdPref = stringPreference;
    }

    public final StringPreference getGoldDepositBoostTransferAmountPref() {
        StringPreference stringPreference = this.goldDepositBoostTransferAmountPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositBoostTransferAmountPref");
        return null;
    }

    public final void setGoldDepositBoostTransferAmountPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.goldDepositBoostTransferAmountPref = stringPreference;
    }

    public final StringPreference getGoldDepositBoostTransferTimestampPref() {
        StringPreference stringPreference = this.goldDepositBoostTransferTimestampPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositBoostTransferTimestampPref");
        return null;
    }

    public final void setGoldDepositBoostTransferTimestampPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.goldDepositBoostTransferTimestampPref = stringPreference;
    }

    private final FragmentTransferDetailConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTransferDetailConfirmationBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit itemsAdapter$lambda$0(RdsDataRowView of, StandardRow item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setLabelText(item.getLabel());
        of.setValueText(item.getValue());
        of.setDescriptionText(item.getValueDescription());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit additionalTextAdapter$lambda$3(final TransferDetailConfirmationFragment transferDetailConfirmationFragment, RhTextView of, Spanned additionalText) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(additionalText, "additionalText");
        of.setText(additionalText);
        final GenericAlert additionalDetailAlert = ((UiPostTransferPage.DetailConfirmation) INSTANCE.getArgs((Fragment) transferDetailConfirmationFragment)).getAdditionalDetailAlert();
        if (additionalDetailAlert != null) {
            of.onLinkClick(new Function1() { // from class: com.robinhood.shared.posttransfer.TransferDetailConfirmationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TransferDetailConfirmationFragment.additionalTextAdapter$lambda$3$lambda$2$lambda$1(this.f$0, additionalDetailAlert, (String) obj));
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean additionalTextAdapter$lambda$3$lambda$2$lambda$1(TransferDetailConfirmationFragment transferDetailConfirmationFragment, GenericAlert genericAlert, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Navigator.DefaultImpls.createDialogFragment$default(transferDetailConfirmationFragment.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(genericAlert, false, false, 0, 14, (DefaultConstructorMarker) null), null, 2, null).show(transferDetailConfirmationFragment.getParentFragmentManager(), "transfer-detail-additional-learn-more");
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        StringPreference goldDepositBoostTransferIdPref = getGoldDepositBoostTransferIdPref();
        Companion companion = INSTANCE;
        goldDepositBoostTransferIdPref.set(((UiPostTransferPage.DetailConfirmation) companion.getArgs((Fragment) this)).getTransferId());
        getGoldDepositBoostTransferAmountPref().set(((UiPostTransferPage.DetailConfirmation) companion.getArgs((Fragment) this)).getAmount());
        getGoldDepositBoostTransferTimestampPref().set(Instant.now().toString());
        FragmentTransferDetailConfirmationBinding binding = getBinding();
        binding.titleTxt.setText(((UiPostTransferPage.DetailConfirmation) companion.getArgs((Fragment) this)).getTitle());
        binding.subtitleTxt.setText(((UiPostTransferPage.DetailConfirmation) companion.getArgs((Fragment) this)).getSubtitle());
        binding.primaryBtn.setText(((UiPostTransferPage.DetailConfirmation) companion.getArgs((Fragment) this)).getPrimaryButton().getTitle());
        RdsButton primaryBtn = binding.primaryBtn;
        Intrinsics.checkNotNullExpressionValue(primaryBtn, "primaryBtn");
        OnClickListeners.onClick(primaryBtn, new TransferDetailConfirmationFragment3(getCallbacks()));
        RecyclerView recyclerView = binding.recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        bindAdapter(recyclerView, this.compositeAdapter);
        this.itemsAdapter.submitList(((UiPostTransferPage.DetailConfirmation) companion.getArgs((Fragment) this)).getItems());
        SingleItemAdapter<RhTextView, Spanned> singleItemAdapter = this.additionalTextAdapter;
        String additionalDetailMarkdown = ((UiPostTransferPage.DetailConfirmation) companion.getArgs((Fragment) this)).getAdditionalDetailMarkdown();
        singleItemAdapter.setData(additionalDetailMarkdown != null ? getMarkwon().toMarkdown(additionalDetailMarkdown) : null);
    }

    /* compiled from: TransferDetailConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferDetailConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/posttransfer/TransferDetailConfirmationFragment;", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$DetailConfirmation;", "<init>", "()V", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TransferDetailConfirmationFragment, UiPostTransferPage.DetailConfirmation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiPostTransferPage.DetailConfirmation getArgs(TransferDetailConfirmationFragment transferDetailConfirmationFragment) {
            return (UiPostTransferPage.DetailConfirmation) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, transferDetailConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransferDetailConfirmationFragment newInstance(UiPostTransferPage.DetailConfirmation detailConfirmation) {
            return (TransferDetailConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, detailConfirmation);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransferDetailConfirmationFragment transferDetailConfirmationFragment, UiPostTransferPage.DetailConfirmation detailConfirmation) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, transferDetailConfirmationFragment, detailConfirmation);
        }
    }
}
