package com.robinhood.compose.bento.component.numpad;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoNumpad.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;", "", "text", "", "contentDescription", "", "keyPressAudioType", "backupText", "onCustomKeyPress", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getText", "()Ljava/lang/String;", "getContentDescription", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getKeyPressAudioType", "()I", "getBackupText", "getOnCustomKeyPress", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;", "equals", "", "other", "hashCode", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CustomKeyConfig {
    public static final int $stable = 0;
    private final String backupText;
    private final Integer contentDescription;
    private final int keyPressAudioType;
    private final Function0<Unit> onCustomKeyPress;
    private final String text;

    public static /* synthetic */ CustomKeyConfig copy$default(CustomKeyConfig customKeyConfig, String str, Integer num, int i, String str2, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = customKeyConfig.text;
        }
        if ((i2 & 2) != 0) {
            num = customKeyConfig.contentDescription;
        }
        if ((i2 & 4) != 0) {
            i = customKeyConfig.keyPressAudioType;
        }
        if ((i2 & 8) != 0) {
            str2 = customKeyConfig.backupText;
        }
        if ((i2 & 16) != 0) {
            function0 = customKeyConfig.onCustomKeyPress;
        }
        Function0 function02 = function0;
        int i3 = i;
        return customKeyConfig.copy(str, num, i3, str2, function02);
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

    public final Function0<Unit> component5() {
        return this.onCustomKeyPress;
    }

    public final CustomKeyConfig copy(String text, Integer contentDescription, int keyPressAudioType, String backupText, Function0<Unit> onCustomKeyPress) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backupText, "backupText");
        Intrinsics.checkNotNullParameter(onCustomKeyPress, "onCustomKeyPress");
        return new CustomKeyConfig(text, contentDescription, keyPressAudioType, backupText, onCustomKeyPress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomKeyConfig)) {
            return false;
        }
        CustomKeyConfig customKeyConfig = (CustomKeyConfig) other;
        return Intrinsics.areEqual(this.text, customKeyConfig.text) && Intrinsics.areEqual(this.contentDescription, customKeyConfig.contentDescription) && this.keyPressAudioType == customKeyConfig.keyPressAudioType && Intrinsics.areEqual(this.backupText, customKeyConfig.backupText) && Intrinsics.areEqual(this.onCustomKeyPress, customKeyConfig.onCustomKeyPress);
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Integer num = this.contentDescription;
        return ((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.keyPressAudioType)) * 31) + this.backupText.hashCode()) * 31) + this.onCustomKeyPress.hashCode();
    }

    public String toString() {
        return "CustomKeyConfig(text=" + this.text + ", contentDescription=" + this.contentDescription + ", keyPressAudioType=" + this.keyPressAudioType + ", backupText=" + this.backupText + ", onCustomKeyPress=" + this.onCustomKeyPress + ")";
    }

    public CustomKeyConfig(String text, Integer num, int i, String backupText, Function0<Unit> onCustomKeyPress) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backupText, "backupText");
        Intrinsics.checkNotNullParameter(onCustomKeyPress, "onCustomKeyPress");
        this.text = text;
        this.contentDescription = num;
        this.keyPressAudioType = i;
        this.backupText = backupText;
        this.onCustomKeyPress = onCustomKeyPress;
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

    public /* synthetic */ CustomKeyConfig(String str, Integer num, int i, String str2, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? str : str2, (i2 & 16) != 0 ? new Function0() { // from class: com.robinhood.compose.bento.component.numpad.CustomKeyConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0);
    }

    public final Function0<Unit> getOnCustomKeyPress() {
        return this.onCustomKeyPress;
    }
}
