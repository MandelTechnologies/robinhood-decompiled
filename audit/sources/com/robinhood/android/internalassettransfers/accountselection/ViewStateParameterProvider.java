package com.robinhood.android.internalassettransfers.accountselection;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionViewState;
import com.robinhood.android.internalassettransfers.accountselection.AccountSelectionViewState3;
import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.utils.resource.StringResource;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import p479j$.time.Instant;

/* compiled from: AccountSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "sourceRow", "Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionRowState;", "sinkRow", "individualAccount", "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "jointAccount", "iraAccount", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class ViewStateParameterProvider implements PreviewParameterProvider<AccountSelectionViewState> {
    private final Sequence<AccountSelectionViewState> values = SequencesKt.sequenceOf(AccountSelectionViewState.Loading.INSTANCE, new AccountSelectionViewState.Error(new IOException()), new AccountSelectionViewState.Loaded(CollectionsKt.listOf((Object[]) new AccountSelectionRowState[]{sourceRow(), sinkRow()}), new AccountSelectionViewState3.Enabled(individualAccount(), jointAccount(), true), null));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<AccountSelectionViewState> getValues() {
        return this.values;
    }

    private final AccountSelectionRowState sourceRow() {
        StringResource.Companion companion = StringResource.INSTANCE;
        return new AccountSelectionRowState(companion.invoke(C18977R.string.from, new Object[0]), companion.invoke(C18977R.string.choose_an_account, new Object[0]), AccountSelectionListFragment.AccountSelectionType.SOURCE, CollectionsKt.listOf((Object[]) new AccountSelectionListFragment.Args.AccountSelectionOption[]{new AccountSelectionListFragment.Args.AccountSelectionOption(individualAccount(), true, null, 4, null), new AccountSelectionListFragment.Args.AccountSelectionOption(jointAccount(), true, null, 4, null), new AccountSelectionListFragment.Args.AccountSelectionOption(iraAccount(), false, null, 4, null)}), true);
    }

    private final AccountSelectionRowState sinkRow() {
        StringResource.Companion companion = StringResource.INSTANCE;
        return new AccountSelectionRowState(companion.invoke(C18977R.string.f4229to, new Object[0]), companion.invoke(C18977R.string.choose_an_account, new Object[0]), AccountSelectionListFragment.AccountSelectionType.SINK, CollectionsKt.listOf((Object[]) new AccountSelectionListFragment.Args.AccountSelectionOption[]{new AccountSelectionListFragment.Args.AccountSelectionOption(individualAccount(), true, null, 4, null), new AccountSelectionListFragment.Args.AccountSelectionOption(jointAccount(), true, null, 4, null), new AccountSelectionListFragment.Args.AccountSelectionOption(iraAccount(), false, null, 4, null)}), true);
    }

    private final UiIatAccount individualAccount() {
        BrokerageAccountType brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
        ManagementType managementType = ManagementType.MANAGED;
        Instant instantOfEpochSecond = Instant.ofEpochSecond(1L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        return new UiIatAccount("12345678", "12345678", brokerageAccountType, true, true, null, managementType, null, instantOfEpochSecond, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, null);
    }

    private final UiIatAccount jointAccount() {
        BrokerageAccountType brokerageAccountType = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
        ManagementType managementType = ManagementType.MANAGED;
        Instant instantOfEpochSecond = Instant.ofEpochSecond(1L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        return new UiIatAccount("87654321", "87654321", brokerageAccountType, true, true, null, managementType, null, instantOfEpochSecond, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, null);
    }

    private final UiIatAccount iraAccount() {
        BrokerageAccountType brokerageAccountType = BrokerageAccountType.IRA_TRADITIONAL;
        ManagementType managementType = ManagementType.MANAGED;
        Instant instantOfEpochSecond = Instant.ofEpochSecond(1L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        return new UiIatAccount("98765432", "98765432", brokerageAccountType, false, false, null, managementType, null, instantOfEpochSecond, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, null);
    }
}
