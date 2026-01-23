package com.robinhood.android.optionschain.sbschain.disclosure;

import android.text.Spanned;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainDisclosureViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/disclosure/OptionSideBySideChainDisclosureViewState;", "", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "content", "Landroid/text/Spanned;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;Landroid/text/Spanned;)V", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "getContent", "()Landroid/text/Spanned;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionSideBySideChainDisclosureViewState {
    public static final int $stable = 8;
    private final Spanned content;
    private final OptionChainLaunchMode launchMode;

    public static /* synthetic */ OptionSideBySideChainDisclosureViewState copy$default(OptionSideBySideChainDisclosureViewState optionSideBySideChainDisclosureViewState, OptionChainLaunchMode optionChainLaunchMode, Spanned spanned, int i, Object obj) {
        if ((i & 1) != 0) {
            optionChainLaunchMode = optionSideBySideChainDisclosureViewState.launchMode;
        }
        if ((i & 2) != 0) {
            spanned = optionSideBySideChainDisclosureViewState.content;
        }
        return optionSideBySideChainDisclosureViewState.copy(optionChainLaunchMode, spanned);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component2, reason: from getter */
    public final Spanned getContent() {
        return this.content;
    }

    public final OptionSideBySideChainDisclosureViewState copy(OptionChainLaunchMode launchMode, Spanned content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new OptionSideBySideChainDisclosureViewState(launchMode, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSideBySideChainDisclosureViewState)) {
            return false;
        }
        OptionSideBySideChainDisclosureViewState optionSideBySideChainDisclosureViewState = (OptionSideBySideChainDisclosureViewState) other;
        return Intrinsics.areEqual(this.launchMode, optionSideBySideChainDisclosureViewState.launchMode) && Intrinsics.areEqual(this.content, optionSideBySideChainDisclosureViewState.content);
    }

    public int hashCode() {
        OptionChainLaunchMode optionChainLaunchMode = this.launchMode;
        return ((optionChainLaunchMode == null ? 0 : optionChainLaunchMode.hashCode()) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "OptionSideBySideChainDisclosureViewState(launchMode=" + this.launchMode + ", content=" + ((Object) this.content) + ")";
    }

    public OptionSideBySideChainDisclosureViewState(OptionChainLaunchMode optionChainLaunchMode, Spanned content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.launchMode = optionChainLaunchMode;
        this.content = content;
    }

    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final Spanned getContent() {
        return this.content;
    }
}
