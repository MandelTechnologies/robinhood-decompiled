package com.robinhood.android.supportchat.thread.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: CxChatTopBar.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars;", "", "<init>", "()V", "EndButtonStatus", "AvatarStatus", "TestTag", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatTopBars, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatTopBar5 {
    public static final int $stable = 0;
    public static final CxChatTopBar5 INSTANCE = new CxChatTopBar5();

    private CxChatTopBar5() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CxChatTopBar.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Enabled", "Disabled", "Hidden", "Loading", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatTopBars$EndButtonStatus */
    public static final class EndButtonStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EndButtonStatus[] $VALUES;
        public static final EndButtonStatus Enabled = new EndButtonStatus("Enabled", 0);
        public static final EndButtonStatus Disabled = new EndButtonStatus("Disabled", 1);
        public static final EndButtonStatus Hidden = new EndButtonStatus("Hidden", 2);
        public static final EndButtonStatus Loading = new EndButtonStatus("Loading", 3);

        private static final /* synthetic */ EndButtonStatus[] $values() {
            return new EndButtonStatus[]{Enabled, Disabled, Hidden, Loading};
        }

        public static EnumEntries<EndButtonStatus> getEntries() {
            return $ENTRIES;
        }

        private EndButtonStatus(String str, int i) {
        }

        static {
            EndButtonStatus[] endButtonStatusArr$values = $values();
            $VALUES = endButtonStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(endButtonStatusArr$values);
        }

        public static EndButtonStatus valueOf(String str) {
            return (EndButtonStatus) Enum.valueOf(EndButtonStatus.class, str);
        }

        public static EndButtonStatus[] values() {
            return (EndButtonStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CxChatTopBar.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Online", "Offline", "Hidden", "indicatorColor", "Landroidx/compose/ui/graphics/Color;", "indicatorColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatTopBars$AvatarStatus */
    public static final class AvatarStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AvatarStatus[] $VALUES;
        public static final AvatarStatus Online = new AvatarStatus("Online", 0);
        public static final AvatarStatus Offline = new AvatarStatus("Offline", 1);
        public static final AvatarStatus Hidden = new AvatarStatus("Hidden", 2);

        /* compiled from: CxChatTopBar.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatTopBars$AvatarStatus$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AvatarStatus.values().length];
                try {
                    iArr[AvatarStatus.Online.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AvatarStatus.Offline.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AvatarStatus.Hidden.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ AvatarStatus[] $values() {
            return new AvatarStatus[]{Online, Offline, Hidden};
        }

        public static EnumEntries<AvatarStatus> getEntries() {
            return $ENTRIES;
        }

        private AvatarStatus(String str, int i) {
        }

        static {
            AvatarStatus[] avatarStatusArr$values = $values();
            $VALUES = avatarStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(avatarStatusArr$values);
        }

        /* renamed from: indicatorColor-WaAFU9c, reason: not valid java name */
        public final long m19183indicatorColorWaAFU9c(Composer composer, int i) {
            long prime;
            composer.startReplaceGroup(2022732932);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2022732932, i, -1, "com.robinhood.android.supportchat.thread.compose.CxChatTopBars.AvatarStatus.indicatorColor (CxChatTopBar.kt:217)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(-1773834327);
                prime = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getPrime();
                composer.endReplaceGroup();
            } else {
                if (i2 != 2 && i2 != 3) {
                    composer.startReplaceGroup(-1773835913);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1773831769);
                prime = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return prime;
        }

        public static AvatarStatus valueOf(String str) {
            return (AvatarStatus) Enum.valueOf(AvatarStatus.class, str);
        }

        public static AvatarStatus[] values() {
            return (AvatarStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CxChatTopBar.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$TestTag;", "", "<init>", "(Ljava/lang/String;I)V", "Avatar", "StatusIndicator", "Title", "EndButton", "EndLoadingIndicator", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatTopBars$TestTag */
    public static final class TestTag {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TestTag[] $VALUES;
        public static final TestTag Avatar = new TestTag("Avatar", 0);
        public static final TestTag StatusIndicator = new TestTag("StatusIndicator", 1);
        public static final TestTag Title = new TestTag("Title", 2);
        public static final TestTag EndButton = new TestTag("EndButton", 3);
        public static final TestTag EndLoadingIndicator = new TestTag("EndLoadingIndicator", 4);

        private static final /* synthetic */ TestTag[] $values() {
            return new TestTag[]{Avatar, StatusIndicator, Title, EndButton, EndLoadingIndicator};
        }

        public static EnumEntries<TestTag> getEntries() {
            return $ENTRIES;
        }

        private TestTag(String str, int i) {
        }

        static {
            TestTag[] testTagArr$values = $values();
            $VALUES = testTagArr$values;
            $ENTRIES = EnumEntries2.enumEntries(testTagArr$values);
        }

        public static TestTag valueOf(String str) {
            return (TestTag) Enum.valueOf(TestTag.class, str);
        }

        public static TestTag[] values() {
            return (TestTag[]) $VALUES.clone();
        }
    }
}
