package com.squareup.workflow1.p415ui.modal;

import com.robinhood.android.car.result.CarResultComposable2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertScreen.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%BO\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/AlertScreen;", "", "", "Lcom/squareup/workflow1/ui/modal/AlertScreen$Button;", "", CarResultComposable2.BUTTONS, "message", "title", "", "cancelable", "Lkotlin/Function1;", "Lcom/squareup/workflow1/ui/modal/AlertScreen$Event;", "", "onEvent", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getButtons", "()Ljava/util/Map;", "Ljava/lang/String;", "getMessage", "getTitle", "Z", "getCancelable", "()Z", "Lkotlin/jvm/functions/Function1;", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "Button", "Event", "wf1-container-common"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AlertScreen {
    private final Map<Button, String> buttons;
    private final boolean cancelable;
    private final String message;
    private final Function1<Event, Unit> onEvent;
    private final String title;

    /* compiled from: AlertScreen.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/AlertScreen$Button;", "", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "NEUTRAL", "wf1-container-common"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public enum Button {
        POSITIVE,
        NEGATIVE,
        NEUTRAL
    }

    public String toString() {
        return "AlertScreen(buttons=" + this.buttons + ", message=" + this.message + ", title=" + this.title + ", cancelable=" + this.cancelable + ", onEvent=" + this.onEvent + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlertScreen(Map<Button, String> buttons, String message, String title, boolean z, Function1<? super Event, Unit> onEvent) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        this.buttons = buttons;
        this.message = message;
        this.title = title;
        this.cancelable = z;
        this.onEvent = onEvent;
    }

    public /* synthetic */ AlertScreen(Map map, String str, String str2, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? true : z, function1);
    }

    public final Map<Button, String> getButtons() {
        return this.buttons;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final Function1<Event, Unit> getOnEvent() {
        return this.onEvent;
    }

    /* compiled from: AlertScreen.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/AlertScreen$Event;", "", "()V", "ButtonClicked", "Canceled", "Lcom/squareup/workflow1/ui/modal/AlertScreen$Event$ButtonClicked;", "Lcom/squareup/workflow1/ui/modal/AlertScreen$Event$Canceled;", "wf1-container-common"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static abstract class Event {
        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: AlertScreen.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/AlertScreen$Event$ButtonClicked;", "Lcom/squareup/workflow1/ui/modal/AlertScreen$Event;", "Lcom/squareup/workflow1/ui/modal/AlertScreen$Button;", "button", "<init>", "(Lcom/squareup/workflow1/ui/modal/AlertScreen$Button;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/squareup/workflow1/ui/modal/AlertScreen$Button;", "getButton", "()Lcom/squareup/workflow1/ui/modal/AlertScreen$Button;", "wf1-container-common"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
        public static final /* data */ class ButtonClicked extends Event {
            private final Button button;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ButtonClicked) && this.button == ((ButtonClicked) other).button;
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            public String toString() {
                return "ButtonClicked(button=" + this.button + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ButtonClicked(Button button) {
                super(null);
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
            }
        }

        private Event() {
        }

        /* compiled from: AlertScreen.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/AlertScreen$Event$Canceled;", "Lcom/squareup/workflow1/ui/modal/AlertScreen$Event;", "()V", "wf1-container-common"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
        public static final class Canceled extends Event {
            public static final Canceled INSTANCE = new Canceled();

            private Canceled() {
                super(null);
            }
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(AlertScreen.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other != null) {
            AlertScreen alertScreen = (AlertScreen) other;
            return Intrinsics.areEqual(this.buttons, alertScreen.buttons) && Intrinsics.areEqual(this.message, alertScreen.message) && Intrinsics.areEqual(this.title, alertScreen.title) && this.cancelable == alertScreen.cancelable;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.AlertScreen");
    }

    public int hashCode() {
        return (((((this.buttons.hashCode() * 31) + this.message.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.cancelable);
    }
}
