package com.robinhood.android.challenge.verification.dialog;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.Bundle2;
import com.robinhood.models.api.Challenge;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChallengeDialogInfo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u00015Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u0019\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0080\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\tHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b!\u0010\u0013R\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogInfo;", "", "id", "", "title", "message", "Lcom/robinhood/utils/resource/StringResource;", "passThroughArgsPair", "Lkotlin/Pair;", "", "positiveButton", "negativeButton", "tag", "shouldClearInput", "", "theme", "<init>", "(Ljava/lang/Integer;ILcom/robinhood/utils/resource/StringResource;Lkotlin/Pair;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()I", "getMessage", "()Lcom/robinhood/utils/resource/StringResource;", "getPassThroughArgsPair", "()Lkotlin/Pair;", "getPositiveButton", "getNegativeButton", "getTag", "()Ljava/lang/String;", "getShouldClearInput", "()Z", "getTheme", "passThroughArgs", "Landroid/os/Bundle;", "getPassThroughArgs", "()Landroid/os/Bundle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;ILcom/robinhood/utils/resource/StringResource;Lkotlin/Pair;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;)Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogInfo;", "equals", "other", "hashCode", "toString", "StartUar", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class ChallengeDialogInfo {
    public static final int $stable = 8;
    private final Integer id;
    private final StringResource message;
    private final Integer negativeButton;
    private final Tuples2<String, Object> passThroughArgsPair;
    private final Integer positiveButton;
    private final boolean shouldClearInput;
    private final String tag;
    private final Integer theme;
    private final int title;

    public static /* synthetic */ ChallengeDialogInfo copy$default(ChallengeDialogInfo challengeDialogInfo, Integer num, int i, StringResource stringResource, Tuples2 tuples2, Integer num2, Integer num3, String str, boolean z, Integer num4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = challengeDialogInfo.id;
        }
        if ((i2 & 2) != 0) {
            i = challengeDialogInfo.title;
        }
        if ((i2 & 4) != 0) {
            stringResource = challengeDialogInfo.message;
        }
        if ((i2 & 8) != 0) {
            tuples2 = challengeDialogInfo.passThroughArgsPair;
        }
        if ((i2 & 16) != 0) {
            num2 = challengeDialogInfo.positiveButton;
        }
        if ((i2 & 32) != 0) {
            num3 = challengeDialogInfo.negativeButton;
        }
        if ((i2 & 64) != 0) {
            str = challengeDialogInfo.tag;
        }
        if ((i2 & 128) != 0) {
            z = challengeDialogInfo.shouldClearInput;
        }
        if ((i2 & 256) != 0) {
            num4 = challengeDialogInfo.theme;
        }
        boolean z2 = z;
        Integer num5 = num4;
        Integer num6 = num3;
        String str2 = str;
        Integer num7 = num2;
        StringResource stringResource2 = stringResource;
        return challengeDialogInfo.copy(num, i, stringResource2, tuples2, num7, num6, str2, z2, num5);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getMessage() {
        return this.message;
    }

    public final Tuples2<String, Object> component4() {
        return this.passThroughArgsPair;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getPositiveButton() {
        return this.positiveButton;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getNegativeButton() {
        return this.negativeButton;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShouldClearInput() {
        return this.shouldClearInput;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getTheme() {
        return this.theme;
    }

    public final ChallengeDialogInfo copy(Integer id, int title, StringResource message, Tuples2<String, ? extends Object> passThroughArgsPair, Integer positiveButton, Integer negativeButton, String tag, boolean shouldClearInput, Integer theme) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new ChallengeDialogInfo(id, title, message, passThroughArgsPair, positiveButton, negativeButton, tag, shouldClearInput, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeDialogInfo)) {
            return false;
        }
        ChallengeDialogInfo challengeDialogInfo = (ChallengeDialogInfo) other;
        return Intrinsics.areEqual(this.id, challengeDialogInfo.id) && this.title == challengeDialogInfo.title && Intrinsics.areEqual(this.message, challengeDialogInfo.message) && Intrinsics.areEqual(this.passThroughArgsPair, challengeDialogInfo.passThroughArgsPair) && Intrinsics.areEqual(this.positiveButton, challengeDialogInfo.positiveButton) && Intrinsics.areEqual(this.negativeButton, challengeDialogInfo.negativeButton) && Intrinsics.areEqual(this.tag, challengeDialogInfo.tag) && this.shouldClearInput == challengeDialogInfo.shouldClearInput && Intrinsics.areEqual(this.theme, challengeDialogInfo.theme);
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (((((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.title)) * 31) + this.message.hashCode()) * 31;
        Tuples2<String, Object> tuples2 = this.passThroughArgsPair;
        int iHashCode2 = (iHashCode + (tuples2 == null ? 0 : tuples2.hashCode())) * 31;
        Integer num2 = this.positiveButton;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.negativeButton;
        int iHashCode4 = (((((iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.tag.hashCode()) * 31) + Boolean.hashCode(this.shouldClearInput)) * 31;
        Integer num4 = this.theme;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeDialogInfo(id=" + this.id + ", title=" + this.title + ", message=" + this.message + ", passThroughArgsPair=" + this.passThroughArgsPair + ", positiveButton=" + this.positiveButton + ", negativeButton=" + this.negativeButton + ", tag=" + this.tag + ", shouldClearInput=" + this.shouldClearInput + ", theme=" + this.theme + ")";
    }

    public ChallengeDialogInfo(Integer num, int i, StringResource message, Tuples2<String, ? extends Object> tuples2, Integer num2, Integer num3, String tag, boolean z, Integer num4) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.id = num;
        this.title = i;
        this.message = message;
        this.passThroughArgsPair = tuples2;
        this.positiveButton = num2;
        this.negativeButton = num3;
        this.tag = tag;
        this.shouldClearInput = z;
        this.theme = num4;
    }

    public /* synthetic */ ChallengeDialogInfo(Integer num, int i, StringResource stringResource, Tuples2 tuples2, Integer num2, Integer num3, String str, boolean z, Integer num4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, i, stringResource, (i2 & 8) != 0 ? null : tuples2, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : num3, str, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? null : num4);
    }

    public final Integer getId() {
        return this.id;
    }

    public final int getTitle() {
        return this.title;
    }

    public final StringResource getMessage() {
        return this.message;
    }

    public final Tuples2<String, Object> getPassThroughArgsPair() {
        return this.passThroughArgsPair;
    }

    public final Integer getPositiveButton() {
        return this.positiveButton;
    }

    public final Integer getNegativeButton() {
        return this.negativeButton;
    }

    public final String getTag() {
        return this.tag;
    }

    public final boolean getShouldClearInput() {
        return this.shouldClearInput;
    }

    public final Integer getTheme() {
        return this.theme;
    }

    public final Bundle getPassThroughArgs() {
        Tuples2<String, Object> tuples2 = this.passThroughArgsPair;
        if (tuples2 != null) {
            return Bundle2.bundleOf(tuples2);
        }
        return null;
    }

    /* compiled from: ChallengeDialogInfo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogInfo$StartUar;", "Landroid/os/Parcelable;", "username", "", "challengeType", "Lcom/robinhood/models/api/Challenge$Type;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/Challenge$Type;)V", "getUsername", "()Ljava/lang/String;", "getChallengeType", "()Lcom/robinhood/models/api/Challenge$Type;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartUar implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<StartUar> CREATOR = new Creator();
        private final Challenge.Type challengeType;
        private final String username;

        /* compiled from: ChallengeDialogInfo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<StartUar> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartUar createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StartUar(parcel.readString(), Challenge.Type.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartUar[] newArray(int i) {
                return new StartUar[i];
            }
        }

        public static /* synthetic */ StartUar copy$default(StartUar startUar, String str, Challenge.Type type2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = startUar.username;
            }
            if ((i & 2) != 0) {
                type2 = startUar.challengeType;
            }
            return startUar.copy(str, type2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        /* renamed from: component2, reason: from getter */
        public final Challenge.Type getChallengeType() {
            return this.challengeType;
        }

        public final StartUar copy(String username, Challenge.Type challengeType) {
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(challengeType, "challengeType");
            return new StartUar(username, challengeType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartUar)) {
                return false;
            }
            StartUar startUar = (StartUar) other;
            return Intrinsics.areEqual(this.username, startUar.username) && this.challengeType == startUar.challengeType;
        }

        public int hashCode() {
            return (this.username.hashCode() * 31) + this.challengeType.hashCode();
        }

        public String toString() {
            return "StartUar(username=" + this.username + ", challengeType=" + this.challengeType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.username);
            dest.writeString(this.challengeType.name());
        }

        public StartUar(String username, Challenge.Type challengeType) {
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(challengeType, "challengeType");
            this.username = username;
            this.challengeType = challengeType;
        }

        public final String getUsername() {
            return this.username;
        }

        public final Challenge.Type getChallengeType() {
            return this.challengeType;
        }
    }
}
