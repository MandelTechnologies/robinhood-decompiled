package com.robinhood.android.charts.cursor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChartCursorDataHeader.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/charts/cursor/AnimationTargetState;", "", "cursorData", "Lcom/robinhood/android/charts/cursor/CursorData;", "isPrivacyEnabled", "", "displayCurrencyCode", "", "<init>", "(Lcom/robinhood/android/charts/cursor/CursorData;ZLjava/lang/String;)V", "getCursorData", "()Lcom/robinhood/android/charts/cursor/CursorData;", "()Z", "getDisplayCurrencyCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AnimationTargetState {
    public static final int $stable = 8;
    private final CursorData cursorData;
    private final String displayCurrencyCode;
    private final boolean isPrivacyEnabled;

    public static /* synthetic */ AnimationTargetState copy$default(AnimationTargetState animationTargetState, CursorData cursorData, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            cursorData = animationTargetState.cursorData;
        }
        if ((i & 2) != 0) {
            z = animationTargetState.isPrivacyEnabled;
        }
        if ((i & 4) != 0) {
            str = animationTargetState.displayCurrencyCode;
        }
        return animationTargetState.copy(cursorData, z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CursorData getCursorData() {
        return this.cursorData;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPrivacyEnabled() {
        return this.isPrivacyEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayCurrencyCode() {
        return this.displayCurrencyCode;
    }

    public final AnimationTargetState copy(CursorData cursorData, boolean isPrivacyEnabled, String displayCurrencyCode) {
        return new AnimationTargetState(cursorData, isPrivacyEnabled, displayCurrencyCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimationTargetState)) {
            return false;
        }
        AnimationTargetState animationTargetState = (AnimationTargetState) other;
        return Intrinsics.areEqual(this.cursorData, animationTargetState.cursorData) && this.isPrivacyEnabled == animationTargetState.isPrivacyEnabled && Intrinsics.areEqual(this.displayCurrencyCode, animationTargetState.displayCurrencyCode);
    }

    public int hashCode() {
        CursorData cursorData = this.cursorData;
        int iHashCode = (((cursorData == null ? 0 : cursorData.hashCode()) * 31) + Boolean.hashCode(this.isPrivacyEnabled)) * 31;
        String str = this.displayCurrencyCode;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AnimationTargetState(cursorData=" + this.cursorData + ", isPrivacyEnabled=" + this.isPrivacyEnabled + ", displayCurrencyCode=" + this.displayCurrencyCode + ")";
    }

    public AnimationTargetState(CursorData cursorData, boolean z, String str) {
        this.cursorData = cursorData;
        this.isPrivacyEnabled = z;
        this.displayCurrencyCode = str;
    }

    public final CursorData getCursorData() {
        return this.cursorData;
    }

    public final boolean isPrivacyEnabled() {
        return this.isPrivacyEnabled;
    }

    public final String getDisplayCurrencyCode() {
        return this.displayCurrencyCode;
    }
}
