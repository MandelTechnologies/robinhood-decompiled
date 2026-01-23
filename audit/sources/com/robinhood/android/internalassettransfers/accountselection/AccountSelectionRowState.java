package com.robinhood.android.internalassettransfers.accountselection;

import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: AccountSelectionViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/AccountSelectionRowState;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "value", "accountSelectionType", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", "options", "", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$Args$AccountSelectionOption;", "enabled", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;Ljava/util/List;Z)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getValue", "getAccountSelectionType", "()Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", "getOptions", "()Ljava/util/List;", "getEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AccountSelectionRowState {
    public static final int $stable = 8;
    private final AccountSelectionListFragment.AccountSelectionType accountSelectionType;
    private final boolean enabled;
    private final StringResource label;
    private final List<AccountSelectionListFragment.Args.AccountSelectionOption> options;
    private final StringResource value;

    public static /* synthetic */ AccountSelectionRowState copy$default(AccountSelectionRowState accountSelectionRowState, StringResource stringResource, StringResource stringResource2, AccountSelectionListFragment.AccountSelectionType accountSelectionType, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = accountSelectionRowState.label;
        }
        if ((i & 2) != 0) {
            stringResource2 = accountSelectionRowState.value;
        }
        if ((i & 4) != 0) {
            accountSelectionType = accountSelectionRowState.accountSelectionType;
        }
        if ((i & 8) != 0) {
            list = accountSelectionRowState.options;
        }
        if ((i & 16) != 0) {
            z = accountSelectionRowState.enabled;
        }
        boolean z2 = z;
        AccountSelectionListFragment.AccountSelectionType accountSelectionType2 = accountSelectionType;
        return accountSelectionRowState.copy(stringResource, stringResource2, accountSelectionType2, list, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final AccountSelectionListFragment.AccountSelectionType getAccountSelectionType() {
        return this.accountSelectionType;
    }

    public final List<AccountSelectionListFragment.Args.AccountSelectionOption> component4() {
        return this.options;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final AccountSelectionRowState copy(StringResource label, StringResource value, AccountSelectionListFragment.AccountSelectionType accountSelectionType, List<AccountSelectionListFragment.Args.AccountSelectionOption> options, boolean enabled) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountSelectionType, "accountSelectionType");
        Intrinsics.checkNotNullParameter(options, "options");
        return new AccountSelectionRowState(label, value, accountSelectionType, options, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSelectionRowState)) {
            return false;
        }
        AccountSelectionRowState accountSelectionRowState = (AccountSelectionRowState) other;
        return Intrinsics.areEqual(this.label, accountSelectionRowState.label) && Intrinsics.areEqual(this.value, accountSelectionRowState.value) && this.accountSelectionType == accountSelectionRowState.accountSelectionType && Intrinsics.areEqual(this.options, accountSelectionRowState.options) && this.enabled == accountSelectionRowState.enabled;
    }

    public int hashCode() {
        return (((((((this.label.hashCode() * 31) + this.value.hashCode()) * 31) + this.accountSelectionType.hashCode()) * 31) + this.options.hashCode()) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "AccountSelectionRowState(label=" + this.label + ", value=" + this.value + ", accountSelectionType=" + this.accountSelectionType + ", options=" + this.options + ", enabled=" + this.enabled + ")";
    }

    public AccountSelectionRowState(StringResource label, StringResource value, AccountSelectionListFragment.AccountSelectionType accountSelectionType, List<AccountSelectionListFragment.Args.AccountSelectionOption> options, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(accountSelectionType, "accountSelectionType");
        Intrinsics.checkNotNullParameter(options, "options");
        this.label = label;
        this.value = value;
        this.accountSelectionType = accountSelectionType;
        this.options = options;
        this.enabled = z;
    }

    public final StringResource getLabel() {
        return this.label;
    }

    public final StringResource getValue() {
        return this.value;
    }

    public final AccountSelectionListFragment.AccountSelectionType getAccountSelectionType() {
        return this.accountSelectionType;
    }

    public final List<AccountSelectionListFragment.Args.AccountSelectionOption> getOptions() {
        return this.options;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
