package com.robinhood.android.margin.p174ui.limit;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: MarginLimitEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitEvent;", "", "<init>", "()V", "RequestFocusForMarginLimitInput", "RemoveFocusForMarginLimitInput", "Lcom/robinhood/android/margin/ui/limit/MarginLimitEvent$RemoveFocusForMarginLimitInput;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitEvent$RequestFocusForMarginLimitInput;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class MarginLimitEvent {
    public static final int $stable = 0;

    public /* synthetic */ MarginLimitEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MarginLimitEvent() {
    }

    /* compiled from: MarginLimitEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitEvent$RequestFocusForMarginLimitInput;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestFocusForMarginLimitInput extends MarginLimitEvent {
        public static final int $stable = 0;
        public static final RequestFocusForMarginLimitInput INSTANCE = new RequestFocusForMarginLimitInput();

        public boolean equals(Object other) {
            return this == other || (other instanceof RequestFocusForMarginLimitInput);
        }

        public int hashCode() {
            return -239485379;
        }

        public String toString() {
            return "RequestFocusForMarginLimitInput";
        }

        private RequestFocusForMarginLimitInput() {
            super(null);
        }
    }

    /* compiled from: MarginLimitEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitEvent$RemoveFocusForMarginLimitInput;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RemoveFocusForMarginLimitInput extends MarginLimitEvent {
        public static final int $stable = 0;
        public static final RemoveFocusForMarginLimitInput INSTANCE = new RemoveFocusForMarginLimitInput();

        public boolean equals(Object other) {
            return this == other || (other instanceof RemoveFocusForMarginLimitInput);
        }

        public int hashCode() {
            return 720614450;
        }

        public String toString() {
            return "RemoveFocusForMarginLimitInput";
        }

        private RemoveFocusForMarginLimitInput() {
            super(null);
        }
    }
}
