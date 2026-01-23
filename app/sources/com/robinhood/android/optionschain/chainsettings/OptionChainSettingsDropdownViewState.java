package com.robinhood.android.optionschain.chainsettings;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainSettingsViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDropdownViewState;", "", "title", "", "hint", "showNewTag", "", "type", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDropdownType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDropdownType;)V", "getTitle", "()Ljava/lang/String;", "getHint", "getShowNewTag", "()Z", "getType", "()Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDropdownType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainSettingsDropdownViewState {
    public static final int $stable = 0;
    private final String hint;
    private final boolean showNewTag;
    private final String title;
    private final OptionChainSettingsViewState2 type;

    public static /* synthetic */ OptionChainSettingsDropdownViewState copy$default(OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState, String str, String str2, boolean z, OptionChainSettingsViewState2 optionChainSettingsViewState2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionChainSettingsDropdownViewState.title;
        }
        if ((i & 2) != 0) {
            str2 = optionChainSettingsDropdownViewState.hint;
        }
        if ((i & 4) != 0) {
            z = optionChainSettingsDropdownViewState.showNewTag;
        }
        if ((i & 8) != 0) {
            optionChainSettingsViewState2 = optionChainSettingsDropdownViewState.type;
        }
        return optionChainSettingsDropdownViewState.copy(str, str2, z, optionChainSettingsViewState2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowNewTag() {
        return this.showNewTag;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionChainSettingsViewState2 getType() {
        return this.type;
    }

    public final OptionChainSettingsDropdownViewState copy(String title, String hint, boolean showNewTag, OptionChainSettingsViewState2 type2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new OptionChainSettingsDropdownViewState(title, hint, showNewTag, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainSettingsDropdownViewState)) {
            return false;
        }
        OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState = (OptionChainSettingsDropdownViewState) other;
        return Intrinsics.areEqual(this.title, optionChainSettingsDropdownViewState.title) && Intrinsics.areEqual(this.hint, optionChainSettingsDropdownViewState.hint) && this.showNewTag == optionChainSettingsDropdownViewState.showNewTag && this.type == optionChainSettingsDropdownViewState.type;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.hint.hashCode()) * 31) + Boolean.hashCode(this.showNewTag)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "OptionChainSettingsDropdownViewState(title=" + this.title + ", hint=" + this.hint + ", showNewTag=" + this.showNewTag + ", type=" + this.type + ")";
    }

    public OptionChainSettingsDropdownViewState(String title, String hint, boolean z, OptionChainSettingsViewState2 type2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.title = title;
        this.hint = hint;
        this.showNewTag = z;
        this.type = type2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getHint() {
        return this.hint;
    }

    public final boolean getShowNewTag() {
        return this.showNewTag;
    }

    public final OptionChainSettingsViewState2 getType() {
        return this.type;
    }
}
