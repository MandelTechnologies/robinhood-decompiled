package com.robinhood.android.navigation.app.keys.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExerciseOptionInstrumentId.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/ExerciseOptionInstrumentId;", "Landroid/os/Parcelable;", "optionInstrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getOptionInstrumentId", "()Ljava/util/UUID;", "AssignedOptionId", "OptionToBeExercisedId", "Lcom/robinhood/android/navigation/app/keys/data/ExerciseOptionInstrumentId$AssignedOptionId;", "Lcom/robinhood/android/navigation/app/keys/data/ExerciseOptionInstrumentId$OptionToBeExercisedId;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class ExerciseOptionInstrumentId implements Parcelable {
    private final UUID optionInstrumentId;

    public /* synthetic */ ExerciseOptionInstrumentId(UUID uuid, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid);
    }

    private ExerciseOptionInstrumentId(UUID uuid) {
        this.optionInstrumentId = uuid;
    }

    public UUID getOptionInstrumentId() {
        return this.optionInstrumentId;
    }

    /* compiled from: ExerciseOptionInstrumentId.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/ExerciseOptionInstrumentId$AssignedOptionId;", "Lcom/robinhood/android/navigation/app/keys/data/ExerciseOptionInstrumentId;", "optionInstrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getOptionInstrumentId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AssignedOptionId extends ExerciseOptionInstrumentId {
        public static final Parcelable.Creator<AssignedOptionId> CREATOR = new Creator();
        private final UUID optionInstrumentId;

        /* compiled from: ExerciseOptionInstrumentId.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AssignedOptionId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AssignedOptionId createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AssignedOptionId((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AssignedOptionId[] newArray(int i) {
                return new AssignedOptionId[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.optionInstrumentId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssignedOptionId(UUID optionInstrumentId) {
            super(optionInstrumentId, null);
            Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
            this.optionInstrumentId = optionInstrumentId;
        }

        @Override // com.robinhood.android.navigation.app.keys.data.ExerciseOptionInstrumentId
        public UUID getOptionInstrumentId() {
            return this.optionInstrumentId;
        }
    }

    /* compiled from: ExerciseOptionInstrumentId.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/ExerciseOptionInstrumentId$OptionToBeExercisedId;", "Lcom/robinhood/android/navigation/app/keys/data/ExerciseOptionInstrumentId;", "optionInstrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getOptionInstrumentId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionToBeExercisedId extends ExerciseOptionInstrumentId {
        public static final Parcelable.Creator<OptionToBeExercisedId> CREATOR = new Creator();
        private final UUID optionInstrumentId;

        /* compiled from: ExerciseOptionInstrumentId.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionToBeExercisedId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionToBeExercisedId createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionToBeExercisedId((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionToBeExercisedId[] newArray(int i) {
                return new OptionToBeExercisedId[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.optionInstrumentId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionToBeExercisedId(UUID optionInstrumentId) {
            super(optionInstrumentId, null);
            Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
            this.optionInstrumentId = optionInstrumentId;
        }

        @Override // com.robinhood.android.navigation.app.keys.data.ExerciseOptionInstrumentId
        public UUID getOptionInstrumentId() {
            return this.optionInstrumentId;
        }
    }
}
