package com.robinhood.android.designsystem.textinput.format;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.designsystem.textinput.format.InputFormatCharacter;
import com.robinhood.android.designsystem.textinput.format.InputFormatCharacterList;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: InputFormatCharacterList.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\nJ\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bJ\u0006\u0010 \u001a\u00020\u0011J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u0011¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u0011¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u0011¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacterList;", "Landroid/os/Parcelable;", "formatCharacters", "", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter;", "<init>", "(Ljava/util/List;)V", "templateString", "", "placeholderString", "(Ljava/lang/String;Ljava/lang/String;)V", "placeholders", "Lkotlin/sequences/Sequence;", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter$Placeholder;", "getPlaceholders$annotations", "()V", "formatCharacterCount", "", "getFormatCharacterCount$annotations", "getFormatCharacterCount", "()I", "firstPlaceholderIndex", "getFirstPlaceholderIndex$annotations", "getFirstPlaceholderIndex", "placeholderCount", "getPlaceholderCount$annotations", "getPlaceholderCount", "getFormatCharacter", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "isValid", "", "input", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InputFormatCharacterList implements Parcelable {
    private final int firstPlaceholderIndex;
    private final int formatCharacterCount;
    private final List<InputFormatCharacter> formatCharacters;
    private final int placeholderCount;
    private final Sequence<InputFormatCharacter.Placeholder> placeholders;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InputFormatCharacterList> CREATOR = new Creator();

    /* compiled from: InputFormatCharacterList.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InputFormatCharacterList> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputFormatCharacterList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(InputFormatCharacterList.class.getClassLoader()));
            }
            return new InputFormatCharacterList(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputFormatCharacterList[] newArray(int i) {
            return new InputFormatCharacterList[i];
        }
    }

    public static /* synthetic */ void getFirstPlaceholderIndex$annotations() {
    }

    public static /* synthetic */ void getFormatCharacterCount$annotations() {
    }

    public static /* synthetic */ void getPlaceholderCount$annotations() {
    }

    private static /* synthetic */ void getPlaceholders$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<InputFormatCharacter> list = this.formatCharacters;
        dest.writeInt(list.size());
        Iterator<InputFormatCharacter> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputFormatCharacterList(List<? extends InputFormatCharacter> formatCharacters) {
        Intrinsics.checkNotNullParameter(formatCharacters, "formatCharacters");
        this.formatCharacters = formatCharacters;
        Sequence<InputFormatCharacter.Placeholder> sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(formatCharacters), new Function1<Object, Boolean>() { // from class: com.robinhood.android.designsystem.textinput.format.InputFormatCharacterList$special$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof InputFormatCharacter.Placeholder);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        this.placeholders = sequenceFilter;
        this.formatCharacterCount = formatCharacters.size();
        Iterator it = formatCharacters.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((InputFormatCharacter) it.next()) instanceof InputFormatCharacter.Placeholder) {
                break;
            } else {
                i++;
            }
        }
        this.firstPlaceholderIndex = i;
        this.placeholderCount = SequencesKt.count(this.placeholders);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFormatCharacterList(String templateString, String placeholderString) {
        this(INSTANCE.fromTemplateString(templateString, placeholderString));
        Intrinsics.checkNotNullParameter(templateString, "templateString");
        Intrinsics.checkNotNullParameter(placeholderString, "placeholderString");
    }

    public final int getFormatCharacterCount() {
        return this.formatCharacterCount;
    }

    public final int getFirstPlaceholderIndex() {
        return this.firstPlaceholderIndex;
    }

    public final int getPlaceholderCount() {
        return this.placeholderCount;
    }

    public final InputFormatCharacter getFormatCharacter(int index) {
        return this.formatCharacters.get(index);
    }

    public final boolean isValid(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() != this.placeholderCount) {
            return false;
        }
        Iterator itIterator2 = SequencesKt.map(SequencesKt.zip(StringsKt.asSequence(input), this.placeholders), new Function1() { // from class: com.robinhood.android.designsystem.textinput.format.InputFormatCharacterList$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InputFormatCharacterList.isValid$lambda$1((Tuples2) obj));
            }
        }).iterator2();
        while (itIterator2.hasNext()) {
            if (!((Boolean) itIterator2.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isValid$lambda$1(Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return ((InputFormatCharacter.Placeholder) tuples2.component2()).isValidReplacement(((Character) tuples2.component1()).charValue());
    }

    /* compiled from: InputFormatCharacterList.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacterList$Companion;", "", "<init>", "()V", "fromTemplateString", "", "Lcom/robinhood/android/designsystem/textinput/format/InputFormatCharacter;", "templateString", "", "placeholderString", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<InputFormatCharacter> fromTemplateString(String templateString, String placeholderString) {
            if (templateString.length() != placeholderString.length()) {
                throw new IllegalArgumentException("Template and placeholder are not equal length!");
            }
            return SequencesKt.toList(SequencesKt.map(SequencesKt.zip(StringsKt.asSequence(templateString), StringsKt.asSequence(placeholderString)), new Function1() { // from class: com.robinhood.android.designsystem.textinput.format.InputFormatCharacterList$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InputFormatCharacterList.Companion.fromTemplateString$lambda$1((Tuples2) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InputFormatCharacter fromTemplateString$lambda$1(Tuples2 tuples2) {
            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
            char cCharValue = ((Character) tuples2.component1()).charValue();
            char cCharValue2 = ((Character) tuples2.component2()).charValue();
            InputFormatCharacter.AllowedCharacter allowedCharacterFromCharacter = InputFormatCharacter.AllowedCharacter.INSTANCE.fromCharacter(cCharValue);
            if (allowedCharacterFromCharacter != null) {
                return new InputFormatCharacter.Placeholder(cCharValue2, allowedCharacterFromCharacter);
            }
            return new InputFormatCharacter.PreFormat(cCharValue2);
        }
    }
}
