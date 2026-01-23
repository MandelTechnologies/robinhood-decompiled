package com.robinhood.android.designsystem.textinput.format;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputFormatCharacter.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter;", "Landroid/os/Parcelable;", "<init>", "()V", "PreFormat", "Placeholder", "AllowedCharacter", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter$Placeholder;", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter$PreFormat;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class InputFormatCharacter implements Parcelable {
    public /* synthetic */ InputFormatCharacter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InputFormatCharacter() {
    }

    /* compiled from: InputFormatCharacter.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter$PreFormat;", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter;", "value", "", "<init>", "(C)V", "getValue", "()C", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PreFormat extends InputFormatCharacter {
        public static final Parcelable.Creator<PreFormat> CREATOR = new Creator();
        private final char value;

        /* compiled from: InputFormatCharacter.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PreFormat> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreFormat createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreFormat((char) parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreFormat[] newArray(int i) {
                return new PreFormat[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.value);
        }

        public PreFormat(char c) {
            super(null);
            this.value = c;
        }

        public final char getValue() {
            return this.value;
        }
    }

    /* compiled from: InputFormatCharacter.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter$Placeholder;", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter;", "placeholder", "", "allowedCharacter", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter$AllowedCharacter;", "<init>", "(CLcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter$AllowedCharacter;)V", "getPlaceholder", "()C", "isValidReplacement", "", "input", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Placeholder extends InputFormatCharacter {
        public static final Parcelable.Creator<Placeholder> CREATOR = new Creator();
        private final AllowedCharacter allowedCharacter;
        private final char placeholder;

        /* compiled from: InputFormatCharacter.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Placeholder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Placeholder createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Placeholder((char) parcel.readInt(), AllowedCharacter.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Placeholder[] newArray(int i) {
                return new Placeholder[i];
            }
        }

        /* compiled from: InputFormatCharacter.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AllowedCharacter.values().length];
                try {
                    iArr[AllowedCharacter.WILDCARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AllowedCharacter.NUMERIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.placeholder);
            dest.writeString(this.allowedCharacter.name());
        }

        public final char getPlaceholder() {
            return this.placeholder;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Placeholder(char c, AllowedCharacter allowedCharacter) {
            super(null);
            Intrinsics.checkNotNullParameter(allowedCharacter, "allowedCharacter");
            this.placeholder = c;
            this.allowedCharacter = allowedCharacter;
        }

        public final boolean isValidReplacement(char input) {
            Function1 function1;
            int i = WhenMappings.$EnumSwitchMapping$0[this.allowedCharacter.ordinal()];
            if (i == 1) {
                function1 = InputFormatCharacter2.INSTANCE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                function1 = InputFormatCharacter3.INSTANCE;
            }
            return ((Boolean) function1.invoke(Character.valueOf(input))).booleanValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InputFormatCharacter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter$AllowedCharacter;", "", "<init>", "(Ljava/lang/String;I)V", "WILDCARD", "NUMERIC", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AllowedCharacter {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AllowedCharacter[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final char TEMPLATE_NUMERIC = '#';
        private static final char TEMPLATE_WILDCARD = '*';
        public static final AllowedCharacter WILDCARD = new AllowedCharacter("WILDCARD", 0);
        public static final AllowedCharacter NUMERIC = new AllowedCharacter("NUMERIC", 1);

        private static final /* synthetic */ AllowedCharacter[] $values() {
            return new AllowedCharacter[]{WILDCARD, NUMERIC};
        }

        public static EnumEntries<AllowedCharacter> getEntries() {
            return $ENTRIES;
        }

        private AllowedCharacter(String str, int i) {
        }

        static {
            AllowedCharacter[] allowedCharacterArr$values = $values();
            $VALUES = allowedCharacterArr$values;
            $ENTRIES = EnumEntries2.enumEntries(allowedCharacterArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: InputFormatCharacter.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter$AllowedCharacter$Companion;", "", "<init>", "()V", "TEMPLATE_WILDCARD", "", "TEMPLATE_NUMERIC", "fromCharacter", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter$AllowedCharacter;", "character", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final AllowedCharacter fromCharacter(char character) {
                if (character == '#') {
                    return AllowedCharacter.NUMERIC;
                }
                if (character != '*') {
                    return null;
                }
                return AllowedCharacter.WILDCARD;
            }
        }

        public static AllowedCharacter valueOf(String str) {
            return (AllowedCharacter) Enum.valueOf(AllowedCharacter.class, str);
        }

        public static AllowedCharacter[] values() {
            return (AllowedCharacter[]) $VALUES.clone();
        }
    }
}
