package com.robinhood.android.optionschain.sbschain.appbar;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainTopAppBarViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarViewState;", "", "title", "", "subtitleRes", "Lcom/robinhood/utils/resource/StringResource;", "nuxDotOnSettingsIcon", "", "optionChainSettingsFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/navigation/keys/FragmentKey;)V", "getTitle", "()Ljava/lang/String;", "getSubtitleRes", "()Lcom/robinhood/utils/resource/StringResource;", "getNuxDotOnSettingsIcon", "()Z", "getOptionChainSettingsFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionSideBySideChainTopAppBarViewState {
    public static final int $stable = 8;
    private final boolean nuxDotOnSettingsIcon;
    private final FragmentKey optionChainSettingsFragmentKey;
    private final StringResource subtitleRes;
    private final String title;

    public static /* synthetic */ OptionSideBySideChainTopAppBarViewState copy$default(OptionSideBySideChainTopAppBarViewState optionSideBySideChainTopAppBarViewState, String str, StringResource stringResource, boolean z, FragmentKey fragmentKey, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionSideBySideChainTopAppBarViewState.title;
        }
        if ((i & 2) != 0) {
            stringResource = optionSideBySideChainTopAppBarViewState.subtitleRes;
        }
        if ((i & 4) != 0) {
            z = optionSideBySideChainTopAppBarViewState.nuxDotOnSettingsIcon;
        }
        if ((i & 8) != 0) {
            fragmentKey = optionSideBySideChainTopAppBarViewState.optionChainSettingsFragmentKey;
        }
        return optionSideBySideChainTopAppBarViewState.copy(str, stringResource, z, fragmentKey);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSubtitleRes() {
        return this.subtitleRes;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNuxDotOnSettingsIcon() {
        return this.nuxDotOnSettingsIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final FragmentKey getOptionChainSettingsFragmentKey() {
        return this.optionChainSettingsFragmentKey;
    }

    public final OptionSideBySideChainTopAppBarViewState copy(String title, StringResource subtitleRes, boolean nuxDotOnSettingsIcon, FragmentKey optionChainSettingsFragmentKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new OptionSideBySideChainTopAppBarViewState(title, subtitleRes, nuxDotOnSettingsIcon, optionChainSettingsFragmentKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSideBySideChainTopAppBarViewState)) {
            return false;
        }
        OptionSideBySideChainTopAppBarViewState optionSideBySideChainTopAppBarViewState = (OptionSideBySideChainTopAppBarViewState) other;
        return Intrinsics.areEqual(this.title, optionSideBySideChainTopAppBarViewState.title) && Intrinsics.areEqual(this.subtitleRes, optionSideBySideChainTopAppBarViewState.subtitleRes) && this.nuxDotOnSettingsIcon == optionSideBySideChainTopAppBarViewState.nuxDotOnSettingsIcon && Intrinsics.areEqual(this.optionChainSettingsFragmentKey, optionSideBySideChainTopAppBarViewState.optionChainSettingsFragmentKey);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        StringResource stringResource = this.subtitleRes;
        int iHashCode2 = (((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + Boolean.hashCode(this.nuxDotOnSettingsIcon)) * 31;
        FragmentKey fragmentKey = this.optionChainSettingsFragmentKey;
        return iHashCode2 + (fragmentKey != null ? fragmentKey.hashCode() : 0);
    }

    public String toString() {
        return "OptionSideBySideChainTopAppBarViewState(title=" + this.title + ", subtitleRes=" + this.subtitleRes + ", nuxDotOnSettingsIcon=" + this.nuxDotOnSettingsIcon + ", optionChainSettingsFragmentKey=" + this.optionChainSettingsFragmentKey + ")";
    }

    public OptionSideBySideChainTopAppBarViewState(String title, StringResource stringResource, boolean z, FragmentKey fragmentKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitleRes = stringResource;
        this.nuxDotOnSettingsIcon = z;
        this.optionChainSettingsFragmentKey = fragmentKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public final StringResource getSubtitleRes() {
        return this.subtitleRes;
    }

    public final boolean getNuxDotOnSettingsIcon() {
        return this.nuxDotOnSettingsIcon;
    }

    public final FragmentKey getOptionChainSettingsFragmentKey() {
        return this.optionChainSettingsFragmentKey;
    }
}
