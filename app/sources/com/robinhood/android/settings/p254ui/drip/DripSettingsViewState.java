package com.robinhood.android.settings.p254ui.drip;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiInstrumentDripSettings;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DripSettingsViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsViewState;", "", "instrumentDripSettings", "", "Lcom/robinhood/models/ui/UiInstrumentDripSettings;", "account", "Lcom/robinhood/models/db/Account;", "<init>", "(Ljava/util/List;Lcom/robinhood/models/db/Account;)V", "getInstrumentDripSettings", "()Ljava/util/List;", "getAccount", "()Lcom/robinhood/models/db/Account;", "isDripEnabled", "", "()Z", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DripSettingsViewState {
    public static final int $stable = 8;
    private final Account account;
    private final List<UiInstrumentDripSettings> instrumentDripSettings;

    /* JADX WARN: Multi-variable type inference failed */
    public DripSettingsViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DripSettingsViewState copy$default(DripSettingsViewState dripSettingsViewState, List list, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dripSettingsViewState.instrumentDripSettings;
        }
        if ((i & 2) != 0) {
            account = dripSettingsViewState.account;
        }
        return dripSettingsViewState.copy(list, account);
    }

    public final List<UiInstrumentDripSettings> component1() {
        return this.instrumentDripSettings;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final DripSettingsViewState copy(List<UiInstrumentDripSettings> instrumentDripSettings, Account account) {
        Intrinsics.checkNotNullParameter(instrumentDripSettings, "instrumentDripSettings");
        return new DripSettingsViewState(instrumentDripSettings, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DripSettingsViewState)) {
            return false;
        }
        DripSettingsViewState dripSettingsViewState = (DripSettingsViewState) other;
        return Intrinsics.areEqual(this.instrumentDripSettings, dripSettingsViewState.instrumentDripSettings) && Intrinsics.areEqual(this.account, dripSettingsViewState.account);
    }

    public int hashCode() {
        int iHashCode = this.instrumentDripSettings.hashCode() * 31;
        Account account = this.account;
        return iHashCode + (account == null ? 0 : account.hashCode());
    }

    public String toString() {
        return "DripSettingsViewState(instrumentDripSettings=" + this.instrumentDripSettings + ", account=" + this.account + ")";
    }

    public DripSettingsViewState(List<UiInstrumentDripSettings> instrumentDripSettings, Account account) {
        Intrinsics.checkNotNullParameter(instrumentDripSettings, "instrumentDripSettings");
        this.instrumentDripSettings = instrumentDripSettings;
        this.account = account;
    }

    public /* synthetic */ DripSettingsViewState(List list, Account account, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : account);
    }

    public final List<UiInstrumentDripSettings> getInstrumentDripSettings() {
        return this.instrumentDripSettings;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean isDripEnabled() {
        Account account = this.account;
        if (account != null) {
            return account.getDripEnabled();
        }
        return false;
    }

    public final StringResource getTitle() {
        DisplayName displayName;
        DisplayName.Variants variants;
        Account account = this.account;
        if (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (variants = displayName.getShort()) == null) {
            return null;
        }
        return variants.getTitle();
    }
}
