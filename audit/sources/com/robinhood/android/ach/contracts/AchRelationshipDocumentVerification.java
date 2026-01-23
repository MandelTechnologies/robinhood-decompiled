package com.robinhood.android.ach.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchRelationshipDocumentVerification.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0011J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/ach/contracts/AchRelationshipDocumentVerification;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "type", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "source", "Lcom/robinhood/android/ach/contracts/AchRelationshipDocumentRequestSource;", "shouldPromptForLockscreen", "", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;Lcom/robinhood/android/ach/contracts/AchRelationshipDocumentRequestSource;ZLcom/robinhood/models/api/ColorTheme;)V", "documentRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "(Lcom/robinhood/models/ui/DocumentRequest;Lcom/robinhood/android/ach/contracts/AchRelationshipDocumentRequestSource;)V", "getId", "()Ljava/util/UUID;", "getType", "()Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "getSource", "()Lcom/robinhood/android/ach/contracts/AchRelationshipDocumentRequestSource;", "getShouldPromptForLockscreen", "()Z", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AchRelationshipDocumentVerification implements IntentKey, Parcelable {
    public static final Parcelable.Creator<AchRelationshipDocumentVerification> CREATOR = new Creator();
    private final UUID id;
    private final boolean shouldPromptForLockscreen;
    private final AchRelationshipDocumentRequestSource source;
    private final ColorTheme theme;
    private final ApiDocumentRequest.Type type;

    /* compiled from: AchRelationshipDocumentVerification.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AchRelationshipDocumentVerification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AchRelationshipDocumentVerification createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AchRelationshipDocumentVerification((UUID) parcel.readSerializable(), ApiDocumentRequest.Type.valueOf(parcel.readString()), AchRelationshipDocumentRequestSource.valueOf(parcel.readString()), parcel.readInt() != 0, ColorTheme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AchRelationshipDocumentVerification[] newArray(int i) {
            return new AchRelationshipDocumentVerification[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        dest.writeString(this.type.name());
        dest.writeString(this.source.name());
        dest.writeInt(this.shouldPromptForLockscreen ? 1 : 0);
        dest.writeString(this.theme.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public AchRelationshipDocumentVerification(UUID id, ApiDocumentRequest.Type type2, AchRelationshipDocumentRequestSource source, boolean z, ColorTheme theme) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.id = id;
        this.type = type2;
        this.source = source;
        this.shouldPromptForLockscreen = z;
        this.theme = theme;
    }

    public final UUID getId() {
        return this.id;
    }

    public final ApiDocumentRequest.Type getType() {
        return this.type;
    }

    public final AchRelationshipDocumentRequestSource getSource() {
        return this.source;
    }

    public final boolean getShouldPromptForLockscreen() {
        return this.shouldPromptForLockscreen;
    }

    public /* synthetic */ AchRelationshipDocumentVerification(UUID uuid, ApiDocumentRequest.Type type2, AchRelationshipDocumentRequestSource achRelationshipDocumentRequestSource, boolean z, ColorTheme colorTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, type2, achRelationshipDocumentRequestSource, (i & 8) != 0 ? true : z, (i & 16) != 0 ? ColorTheme.DEFAULT : colorTheme);
    }

    public final ColorTheme getTheme() {
        return this.theme;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AchRelationshipDocumentVerification(DocumentRequest documentRequest, AchRelationshipDocumentRequestSource source) {
        Intrinsics.checkNotNullParameter(documentRequest, "documentRequest");
        Intrinsics.checkNotNullParameter(source, "source");
        UUID id = documentRequest.getId();
        if (id != null) {
            this(id, documentRequest.getType(), source, false, null, 24, null);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
