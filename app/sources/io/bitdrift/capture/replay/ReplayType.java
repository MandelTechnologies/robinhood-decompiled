package io.bitdrift.capture.replay;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReplayType.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u000e\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType;", "", "typeValue", "", "(I)V", "getTypeValue", "()I", "toString", "", "BackgroundImage", "Button", "Chevron", "Ignore", "Image", "Keyboard", "Label", "Map", "SwitchOff", "SwitchOn", "TextInput", "TransparentView", "View", "WebView", "Lio/bitdrift/capture/replay/ReplayType$BackgroundImage;", "Lio/bitdrift/capture/replay/ReplayType$Button;", "Lio/bitdrift/capture/replay/ReplayType$Chevron;", "Lio/bitdrift/capture/replay/ReplayType$Ignore;", "Lio/bitdrift/capture/replay/ReplayType$Image;", "Lio/bitdrift/capture/replay/ReplayType$Keyboard;", "Lio/bitdrift/capture/replay/ReplayType$Label;", "Lio/bitdrift/capture/replay/ReplayType$Map;", "Lio/bitdrift/capture/replay/ReplayType$SwitchOff;", "Lio/bitdrift/capture/replay/ReplayType$SwitchOn;", "Lio/bitdrift/capture/replay/ReplayType$TextInput;", "Lio/bitdrift/capture/replay/ReplayType$TransparentView;", "Lio/bitdrift/capture/replay/ReplayType$View;", "Lio/bitdrift/capture/replay/ReplayType$WebView;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public abstract class ReplayType {
    private final int typeValue;

    public /* synthetic */ ReplayType(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    private ReplayType(int i) {
        this.typeValue = i;
    }

    public final int getTypeValue() {
        return this.typeValue;
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$Label;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Label extends ReplayType {
        public static final Label INSTANCE = new Label();

        public boolean equals(Object other) {
            return this == other || (other instanceof Label);
        }

        public int hashCode() {
            return -646043748;
        }

        @Override // io.bitdrift.capture.replay.ReplayType
        public String toString() {
            return "Label";
        }

        private Label() {
            super(0, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$Button;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Button extends ReplayType {
        public static final Button INSTANCE = new Button();

        private Button() {
            super(1, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$TextInput;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class TextInput extends ReplayType {
        public static final TextInput INSTANCE = new TextInput();

        private TextInput() {
            super(2, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$Image;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Image extends ReplayType {
        public static final Image INSTANCE = new Image();

        private Image() {
            super(3, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$View;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class View extends ReplayType {
        public static final View INSTANCE = new View();

        private View() {
            super(4, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$BackgroundImage;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class BackgroundImage extends ReplayType {
        public static final BackgroundImage INSTANCE = new BackgroundImage();

        private BackgroundImage() {
            super(5, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$SwitchOn;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class SwitchOn extends ReplayType {
        public static final SwitchOn INSTANCE = new SwitchOn();

        private SwitchOn() {
            super(6, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$SwitchOff;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class SwitchOff extends ReplayType {
        public static final SwitchOff INSTANCE = new SwitchOff();

        private SwitchOff() {
            super(7, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$Map;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Map extends ReplayType {
        public static final Map INSTANCE = new Map();

        private Map() {
            super(8, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$Chevron;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Chevron extends ReplayType {
        public static final Chevron INSTANCE = new Chevron();

        private Chevron() {
            super(9, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$TransparentView;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class TransparentView extends ReplayType {
        public static final TransparentView INSTANCE = new TransparentView();

        private TransparentView() {
            super(10, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$Keyboard;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Keyboard extends ReplayType {
        public static final Keyboard INSTANCE = new Keyboard();

        private Keyboard() {
            super(11, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$WebView;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class WebView extends ReplayType {
        public static final WebView INSTANCE = new WebView();

        private WebView() {
            super(12, null);
        }
    }

    /* compiled from: ReplayType.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lio/bitdrift/capture/replay/ReplayType$Ignore;", "Lio/bitdrift/capture/replay/ReplayType;", "()V", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Ignore extends ReplayType {
        public static final Ignore INSTANCE = new Ignore();

        private Ignore() {
            super(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        }
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
