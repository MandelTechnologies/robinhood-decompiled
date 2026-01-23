package com.robinhood.android.supportchat.thread.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: CxChatBottomControls.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle;", "", "<init>", "()V", "SendButton", "ImageButton", "Input", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlStyle, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatBottomControls {
    public static final int $stable = 0;
    public static final CxChatBottomControls INSTANCE = new CxChatBottomControls();

    private CxChatBottomControls() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CxChatBottomControls.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "", "<init>", "(Ljava/lang/String;I)V", "Enabled", "Disabled", "Hidden", "Loading", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlStyle$SendButton */
    public static final class SendButton {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SendButton[] $VALUES;
        public static final SendButton Enabled = new SendButton("Enabled", 0);
        public static final SendButton Disabled = new SendButton("Disabled", 1);
        public static final SendButton Hidden = new SendButton("Hidden", 2);
        public static final SendButton Loading = new SendButton("Loading", 3);

        private static final /* synthetic */ SendButton[] $values() {
            return new SendButton[]{Enabled, Disabled, Hidden, Loading};
        }

        public static EnumEntries<SendButton> getEntries() {
            return $ENTRIES;
        }

        private SendButton(String str, int i) {
        }

        static {
            SendButton[] sendButtonArr$values = $values();
            $VALUES = sendButtonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sendButtonArr$values);
        }

        public static SendButton valueOf(String str) {
            return (SendButton) Enum.valueOf(SendButton.class, str);
        }

        public static SendButton[] values() {
            return (SendButton[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CxChatBottomControls.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "", "<init>", "(Ljava/lang/String;I)V", "Enabled", "Hidden", "Disabled", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlStyle$ImageButton */
    public static final class ImageButton {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ImageButton[] $VALUES;
        public static final ImageButton Enabled = new ImageButton("Enabled", 0);
        public static final ImageButton Hidden = new ImageButton("Hidden", 1);
        public static final ImageButton Disabled = new ImageButton("Disabled", 2);

        private static final /* synthetic */ ImageButton[] $values() {
            return new ImageButton[]{Enabled, Hidden, Disabled};
        }

        public static EnumEntries<ImageButton> getEntries() {
            return $ENTRIES;
        }

        private ImageButton(String str, int i) {
        }

        static {
            ImageButton[] imageButtonArr$values = $values();
            $VALUES = imageButtonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(imageButtonArr$values);
        }

        public static ImageButton valueOf(String str) {
            return (ImageButton) Enum.valueOf(ImageButton.class, str);
        }

        public static ImageButton[] values() {
            return (ImageButton[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CxChatBottomControls.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "", "<init>", "(Ljava/lang/String;I)V", "Enabled", "Disabled", "Hidden", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlStyle$Input */
    public static final class Input {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Input[] $VALUES;
        public static final Input Enabled = new Input("Enabled", 0);
        public static final Input Disabled = new Input("Disabled", 1);
        public static final Input Hidden = new Input("Hidden", 2);

        private static final /* synthetic */ Input[] $values() {
            return new Input[]{Enabled, Disabled, Hidden};
        }

        public static EnumEntries<Input> getEntries() {
            return $ENTRIES;
        }

        private Input(String str, int i) {
        }

        static {
            Input[] inputArr$values = $values();
            $VALUES = inputArr$values;
            $ENTRIES = EnumEntries2.enumEntries(inputArr$values);
        }

        public static Input valueOf(String str) {
            return (Input) Enum.valueOf(Input.class, str);
        }

        public static Input[] values() {
            return (Input[]) $VALUES.clone();
        }
    }
}
