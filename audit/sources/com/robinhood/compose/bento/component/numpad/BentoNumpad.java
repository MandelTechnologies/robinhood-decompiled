package com.robinhood.compose.bento.component.numpad;

import android.view.KeyCharacterMap;
import androidx.compose.p011ui.input.key.Key;
import androidx.compose.p011ui.input.key.Key_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoNumpad.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData;", "", "<init>", "()V", "Button", "CustomButton", "Empty", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData$Button;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData$CustomButton;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData$Empty;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.numpad.BentoNumpadButtonData, reason: use source file name */
/* loaded from: classes15.dex */
abstract class BentoNumpad {
    public /* synthetic */ BentoNumpad(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BentoNumpad() {
    }

    /* compiled from: BentoNumpad.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\rJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÂ\u0003JF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData$Button;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData;", "key", "Landroidx/compose/ui/input/key/Key;", "icon", "", "contentDescription", "keyPressAudioType", "backupText", "", "<init>", "(JLjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getKey-EK5gGoQ", "()J", "J", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContentDescription", "getKeyPressAudioType", "()I", "buttonString", "inspectionMode", "", "characterMap", "Landroid/view/KeyCharacterMap;", "component1", "component1-EK5gGoQ", "component2", "component3", "component4", "component5", "copy", "copy-yzqMiHI", "(JLjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;)Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData$Button;", "equals", "other", "", "hashCode", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.numpad.BentoNumpadButtonData$Button, reason: from toString */
    public static final /* data */ class Button extends BentoNumpad {
        public static final int $stable = 0;
        private final String backupText;
        private final Integer contentDescription;
        private final Integer icon;
        private final long key;
        private final int keyPressAudioType;

        public /* synthetic */ Button(long j, Integer num, Integer num2, int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, num, num2, i, str);
        }

        /* renamed from: component5, reason: from getter */
        private final String getBackupText() {
            return this.backupText;
        }

        /* renamed from: copy-yzqMiHI$default, reason: not valid java name */
        public static /* synthetic */ Button m20887copyyzqMiHI$default(Button button, long j, Integer num, Integer num2, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = button.key;
            }
            long j2 = j;
            if ((i2 & 2) != 0) {
                num = button.icon;
            }
            Integer num3 = num;
            if ((i2 & 4) != 0) {
                num2 = button.contentDescription;
            }
            Integer num4 = num2;
            if ((i2 & 8) != 0) {
                i = button.keyPressAudioType;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                str = button.backupText;
            }
            return button.m20889copyyzqMiHI(j2, num3, num4, i3, str);
        }

        /* renamed from: component1-EK5gGoQ, reason: not valid java name and from getter */
        public final long getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getContentDescription() {
            return this.contentDescription;
        }

        /* renamed from: component4, reason: from getter */
        public final int getKeyPressAudioType() {
            return this.keyPressAudioType;
        }

        /* renamed from: copy-yzqMiHI, reason: not valid java name */
        public final Button m20889copyyzqMiHI(long key, Integer icon, Integer contentDescription, int keyPressAudioType, String backupText) {
            Intrinsics.checkNotNullParameter(backupText, "backupText");
            return new Button(key, icon, contentDescription, keyPressAudioType, backupText, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Key.m7078equalsimpl0(this.key, button.key) && Intrinsics.areEqual(this.icon, button.icon) && Intrinsics.areEqual(this.contentDescription, button.contentDescription) && this.keyPressAudioType == button.keyPressAudioType && Intrinsics.areEqual(this.backupText, button.backupText);
        }

        public int hashCode() {
            int iM7079hashCodeimpl = Key.m7079hashCodeimpl(this.key) * 31;
            Integer num = this.icon;
            int iHashCode = (iM7079hashCodeimpl + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.contentDescription;
            return ((((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.keyPressAudioType)) * 31) + this.backupText.hashCode();
        }

        public String toString() {
            return "Button(key=" + Key.m7080toStringimpl(this.key) + ", icon=" + this.icon + ", contentDescription=" + this.contentDescription + ", keyPressAudioType=" + this.keyPressAudioType + ", backupText=" + this.backupText + ")";
        }

        public /* synthetic */ Button(long j, Integer num, Integer num2, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? 0 : i, str, null);
        }

        /* renamed from: getKey-EK5gGoQ, reason: not valid java name */
        public final long m20890getKeyEK5gGoQ() {
            return this.key;
        }

        public final Integer getIcon() {
            return this.icon;
        }

        public final Integer getContentDescription() {
            return this.contentDescription;
        }

        public final int getKeyPressAudioType() {
            return this.keyPressAudioType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Button(long j, Integer num, Integer num2, int i, String backupText) {
            super(null);
            Intrinsics.checkNotNullParameter(backupText, "backupText");
            this.key = j;
            this.icon = num;
            this.contentDescription = num2;
            this.keyPressAudioType = i;
            this.backupText = backupText;
        }

        public final String buttonString(boolean inspectionMode, KeyCharacterMap characterMap) {
            if (inspectionMode) {
                return this.backupText;
            }
            Intrinsics.checkNotNull(characterMap);
            return String.valueOf(characterMap.getDisplayLabel(Key_androidKt.m7123getNativeKeyCodeYVgTNJs(this.key)));
        }
    }

    /* compiled from: BentoNumpad.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData$CustomButton;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData;", "text", "", "contentDescription", "", "keyPressAudioType", "backupText", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;)V", "getText", "()Ljava/lang/String;", "getContentDescription", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getKeyPressAudioType", "()I", "getBackupText", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;)Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData$CustomButton;", "equals", "", "other", "", "hashCode", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.numpad.BentoNumpadButtonData$CustomButton, reason: from toString */
    public static final /* data */ class CustomButton extends BentoNumpad {
        public static final int $stable = 0;
        private final String backupText;
        private final Integer contentDescription;
        private final int keyPressAudioType;
        private final String text;

        public static /* synthetic */ CustomButton copy$default(CustomButton customButton, String str, Integer num, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = customButton.text;
            }
            if ((i2 & 2) != 0) {
                num = customButton.contentDescription;
            }
            if ((i2 & 4) != 0) {
                i = customButton.keyPressAudioType;
            }
            if ((i2 & 8) != 0) {
                str2 = customButton.backupText;
            }
            return customButton.copy(str, num, i, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getContentDescription() {
            return this.contentDescription;
        }

        /* renamed from: component3, reason: from getter */
        public final int getKeyPressAudioType() {
            return this.keyPressAudioType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackupText() {
            return this.backupText;
        }

        public final CustomButton copy(String text, Integer contentDescription, int keyPressAudioType, String backupText) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(backupText, "backupText");
            return new CustomButton(text, contentDescription, keyPressAudioType, backupText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomButton)) {
                return false;
            }
            CustomButton customButton = (CustomButton) other;
            return Intrinsics.areEqual(this.text, customButton.text) && Intrinsics.areEqual(this.contentDescription, customButton.contentDescription) && this.keyPressAudioType == customButton.keyPressAudioType && Intrinsics.areEqual(this.backupText, customButton.backupText);
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            Integer num = this.contentDescription;
            return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.keyPressAudioType)) * 31) + this.backupText.hashCode();
        }

        public String toString() {
            return "CustomButton(text=" + this.text + ", contentDescription=" + this.contentDescription + ", keyPressAudioType=" + this.keyPressAudioType + ", backupText=" + this.backupText + ")";
        }

        public /* synthetic */ CustomButton(String str, Integer num, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? 0 : i, str2);
        }

        public final String getText() {
            return this.text;
        }

        public final Integer getContentDescription() {
            return this.contentDescription;
        }

        public final int getKeyPressAudioType() {
            return this.keyPressAudioType;
        }

        public final String getBackupText() {
            return this.backupText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomButton(String text, Integer num, int i, String backupText) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(backupText, "backupText");
            this.text = text;
            this.contentDescription = num;
            this.keyPressAudioType = i;
            this.backupText = backupText;
        }
    }

    /* compiled from: BentoNumpad.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData$Empty;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData;", "<init>", "()V", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.numpad.BentoNumpadButtonData$Empty */
    public static final class Empty extends BentoNumpad {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super(null);
        }
    }
}
