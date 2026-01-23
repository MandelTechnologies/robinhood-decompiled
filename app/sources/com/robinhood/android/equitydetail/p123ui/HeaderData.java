package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.educationtour.interfaces.EducationTourViewData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/HeaderData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourViewData;", "<init>", "()V", "educationTourId", "", "getEducationTourId", "()Ljava/lang/String;", "headerData", "", "getHeaderData", "()Ljava/lang/Void;", "elementIds", "", "getElementIds", "()Ljava/util/List;", "elementIds$delegate", "Lkotlin/Lazy;", "FromResource", "FromCharSequence", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromCharSequence;", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public abstract class HeaderData extends DetailData implements EducationTourViewData {
    public static final int $stable = 8;

    /* renamed from: elementIds$delegate, reason: from kotlin metadata */
    private final Lazy elementIds;
    private final Void headerData;

    public /* synthetic */ HeaderData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getEducationTourId();

    private HeaderData() {
        super(null);
        this.elementIds = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equitydetail.ui.HeaderData$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HeaderData.elementIds_delegate$lambda$0(this.f$0);
            }
        });
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public /* bridge */ /* synthetic */ DetailData getHeaderData() {
        return (DetailData) this.headerData;
    }

    public final Void getHeaderData() {
        return this.headerData;
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourViewData
    public List<String> getElementIds() {
        return (List) this.elementIds.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List elementIds_delegate$lambda$0(HeaderData headerData) {
        return CollectionsKt.toMutableList((Collection) CollectionsKt.listOfNotNull(headerData.getEducationTourId()));
    }

    /* compiled from: DetailData.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB+\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "Lcom/robinhood/android/equitydetail/ui/HeaderData;", "textResId", "", "formatArgs", "", "", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "educationTourId", "", "<init>", "(ILjava/util/List;Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;Ljava/lang/String;)V", "(ILcom/robinhood/models/api/bonfire/ApiStockDetail$Section;Ljava/lang/String;)V", "getTextResId", "()I", "getFormatArgs", "()Ljava/util/List;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getEducationTourId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FromResource extends HeaderData {
        public static final int $stable = 8;
        private final String educationTourId;
        private final List<Object> formatArgs;
        private final ApiStockDetail.Section section;
        private final int textResId;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FromResource copy$default(FromResource fromResource, int i, List list, ApiStockDetail.Section section, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = fromResource.textResId;
            }
            if ((i2 & 2) != 0) {
                list = fromResource.formatArgs;
            }
            if ((i2 & 4) != 0) {
                section = fromResource.section;
            }
            if ((i2 & 8) != 0) {
                str = fromResource.educationTourId;
            }
            return fromResource.copy(i, list, section, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTextResId() {
            return this.textResId;
        }

        public final List<Object> component2() {
            return this.formatArgs;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiStockDetail.Section getSection() {
            return this.section;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEducationTourId() {
            return this.educationTourId;
        }

        public final FromResource copy(int textResId, List<? extends Object> formatArgs, ApiStockDetail.Section section, String educationTourId) {
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            return new FromResource(textResId, formatArgs, section, educationTourId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FromResource)) {
                return false;
            }
            FromResource fromResource = (FromResource) other;
            return this.textResId == fromResource.textResId && Intrinsics.areEqual(this.formatArgs, fromResource.formatArgs) && this.section == fromResource.section && Intrinsics.areEqual(this.educationTourId, fromResource.educationTourId);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.textResId) * 31) + this.formatArgs.hashCode()) * 31;
            ApiStockDetail.Section section = this.section;
            int iHashCode2 = (iHashCode + (section == null ? 0 : section.hashCode())) * 31;
            String str = this.educationTourId;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "FromResource(textResId=" + this.textResId + ", formatArgs=" + this.formatArgs + ", section=" + this.section + ", educationTourId=" + this.educationTourId + ")";
        }

        public /* synthetic */ FromResource(int i, List list, ApiStockDetail.Section section, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, list, (i2 & 4) != 0 ? null : section, (i2 & 8) != 0 ? null : str);
        }

        public final int getTextResId() {
            return this.textResId;
        }

        public final List<Object> getFormatArgs() {
            return this.formatArgs;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.DetailData
        public ApiStockDetail.Section getSection() {
            return this.section;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.HeaderData
        public String getEducationTourId() {
            return this.educationTourId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromResource(int i, List<? extends Object> formatArgs, ApiStockDetail.Section section, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            this.textResId = i;
            this.formatArgs = formatArgs;
            this.section = section;
            this.educationTourId = str;
        }

        public /* synthetic */ FromResource(int i, ApiStockDetail.Section section, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : section, (i2 & 4) != 0 ? null : str);
        }

        public FromResource(int i, ApiStockDetail.Section section, String str) {
            this(i, CollectionsKt.emptyList(), section, str);
        }
    }

    /* compiled from: DetailData.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/HeaderData$FromCharSequence;", "Lcom/robinhood/android/equitydetail/ui/HeaderData;", "text", "", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "educationTourId", "", "<init>", "(Ljava/lang/CharSequence;Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;Ljava/lang/String;)V", "getText", "()Ljava/lang/CharSequence;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getEducationTourId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FromCharSequence extends HeaderData {
        public static final int $stable = 8;
        private final String educationTourId;
        private final ApiStockDetail.Section section;
        private final CharSequence text;

        public static /* synthetic */ FromCharSequence copy$default(FromCharSequence fromCharSequence, CharSequence charSequence, ApiStockDetail.Section section, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = fromCharSequence.text;
            }
            if ((i & 2) != 0) {
                section = fromCharSequence.section;
            }
            if ((i & 4) != 0) {
                str = fromCharSequence.educationTourId;
            }
            return fromCharSequence.copy(charSequence, section, str);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiStockDetail.Section getSection() {
            return this.section;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEducationTourId() {
            return this.educationTourId;
        }

        public final FromCharSequence copy(CharSequence text, ApiStockDetail.Section section, String educationTourId) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(section, "section");
            return new FromCharSequence(text, section, educationTourId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FromCharSequence)) {
                return false;
            }
            FromCharSequence fromCharSequence = (FromCharSequence) other;
            return Intrinsics.areEqual(this.text, fromCharSequence.text) && this.section == fromCharSequence.section && Intrinsics.areEqual(this.educationTourId, fromCharSequence.educationTourId);
        }

        public int hashCode() {
            int iHashCode = ((this.text.hashCode() * 31) + this.section.hashCode()) * 31;
            String str = this.educationTourId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            CharSequence charSequence = this.text;
            return "FromCharSequence(text=" + ((Object) charSequence) + ", section=" + this.section + ", educationTourId=" + this.educationTourId + ")";
        }

        public /* synthetic */ FromCharSequence(CharSequence charSequence, ApiStockDetail.Section section, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence, section, (i & 4) != 0 ? null : str);
        }

        public final CharSequence getText() {
            return this.text;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.DetailData
        public ApiStockDetail.Section getSection() {
            return this.section;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.HeaderData
        public String getEducationTourId() {
            return this.educationTourId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromCharSequence(CharSequence text, ApiStockDetail.Section section, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(section, "section");
            this.text = text;
            this.section = section;
            this.educationTourId = str;
        }
    }
}
