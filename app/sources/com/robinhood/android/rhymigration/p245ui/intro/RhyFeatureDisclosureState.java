package com.robinhood.android.rhymigration.p245ui.intro;

import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyFeatureDisclosureState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureDisclosureState;", "", "content", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "error", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/staticcontent/model/disclosure/Disclosure;Lcom/robinhood/udf/UiEvent;)V", "getContent", "()Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "getError", "()Lcom/robinhood/udf/UiEvent;", "isLoading", "", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyFeatureDisclosureState {
    public static final int $stable = 8;
    private final Disclosure content;
    private final UiEvent<Throwable> error;
    private final boolean isLoading;

    /* JADX WARN: Multi-variable type inference failed */
    public RhyFeatureDisclosureState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RhyFeatureDisclosureState copy$default(RhyFeatureDisclosureState rhyFeatureDisclosureState, Disclosure disclosure, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            disclosure = rhyFeatureDisclosureState.content;
        }
        if ((i & 2) != 0) {
            uiEvent = rhyFeatureDisclosureState.error;
        }
        return rhyFeatureDisclosureState.copy(disclosure, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final Disclosure getContent() {
        return this.content;
    }

    public final UiEvent<Throwable> component2() {
        return this.error;
    }

    public final RhyFeatureDisclosureState copy(Disclosure content, UiEvent<Throwable> error) {
        return new RhyFeatureDisclosureState(content, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyFeatureDisclosureState)) {
            return false;
        }
        RhyFeatureDisclosureState rhyFeatureDisclosureState = (RhyFeatureDisclosureState) other;
        return Intrinsics.areEqual(this.content, rhyFeatureDisclosureState.content) && Intrinsics.areEqual(this.error, rhyFeatureDisclosureState.error);
    }

    public int hashCode() {
        Disclosure disclosure = this.content;
        int iHashCode = (disclosure == null ? 0 : disclosure.hashCode()) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "RhyFeatureDisclosureState(content=" + this.content + ", error=" + this.error + ")";
    }

    public RhyFeatureDisclosureState(Disclosure disclosure, UiEvent<Throwable> uiEvent) {
        this.content = disclosure;
        this.error = uiEvent;
        this.isLoading = disclosure == null && uiEvent == null;
    }

    public /* synthetic */ RhyFeatureDisclosureState(Disclosure disclosure, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : disclosure, (i & 2) != 0 ? null : uiEvent);
    }

    public final Disclosure getContent() {
        return this.content;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }
}
