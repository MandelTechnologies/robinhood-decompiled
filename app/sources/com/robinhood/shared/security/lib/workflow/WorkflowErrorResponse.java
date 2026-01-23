package com.robinhood.shared.security.lib.workflow;

import com.robinhood.models.api.ErrorResponse;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: WorkflowErrorResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/security/lib/workflow/WorkflowErrorResponse;", "", "code", "", "message", "", ErrorBundle.DETAIL_ENTRY, "", "Lcom/robinhood/shared/security/lib/workflow/WorkflowErrorResponse$Details;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "getDetails", "()Ljava/util/List;", ErrorResponse.DETAIL, "getDetail", "()Lcom/robinhood/shared/security/lib/workflow/WorkflowErrorResponse$Details;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Details", "Companion", "lib-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class WorkflowErrorResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PolymorphicJsonAdapterFactory<Details> jsonAdapterFactory;
    private final int code;
    private final List<Details> details;
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkflowErrorResponse copy$default(WorkflowErrorResponse workflowErrorResponse, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = workflowErrorResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = workflowErrorResponse.message;
        }
        if ((i2 & 4) != 0) {
            list = workflowErrorResponse.details;
        }
        return workflowErrorResponse.copy(i, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<Details> component3() {
        return this.details;
    }

    public final WorkflowErrorResponse copy(int code, String message, List<? extends Details> details) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new WorkflowErrorResponse(code, message, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowErrorResponse)) {
            return false;
        }
        WorkflowErrorResponse workflowErrorResponse = (WorkflowErrorResponse) other;
        return this.code == workflowErrorResponse.code && Intrinsics.areEqual(this.message, workflowErrorResponse.message) && Intrinsics.areEqual(this.details, workflowErrorResponse.details);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31;
        List<Details> list = this.details;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "WorkflowErrorResponse(code=" + this.code + ", message=" + this.message + ", details=" + this.details + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkflowErrorResponse(int i, String message, List<? extends Details> list) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.message = message;
        this.details = list;
    }

    public /* synthetic */ WorkflowErrorResponse(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : list);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<Details> getDetails() {
        return this.details;
    }

    public final Details getDetail() {
        List<Details> list = this.details;
        if (list != null) {
            return (Details) CollectionsKt.firstOrNull((List) list);
        }
        return null;
    }

    /* compiled from: WorkflowErrorResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/security/lib/workflow/WorkflowErrorResponse$Details;", "", "<init>", "()V", "Unknown", "Lcom/robinhood/shared/security/lib/workflow/WorkflowErrorResponse$Details$Unknown;", "lib-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Details {
        public /* synthetic */ Details(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Details() {
        }

        /* compiled from: WorkflowErrorResponse.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/lib/workflow/WorkflowErrorResponse$Details$Unknown;", "Lcom/robinhood/shared/security/lib/workflow/WorkflowErrorResponse$Details;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Unknown extends Details {
            public static final Unknown INSTANCE = new Unknown();

            public boolean equals(Object other) {
                return this == other || (other instanceof Unknown);
            }

            public int hashCode() {
                return -1986519378;
            }

            public String toString() {
                return "Unknown";
            }

            private Unknown() {
                super(null);
            }
        }
    }

    /* compiled from: WorkflowErrorResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/security/lib/workflow/WorkflowErrorResponse$Companion;", "", "<init>", "()V", "jsonAdapterFactory", "Lcom/squareup/moshi/adapters/PolymorphicJsonAdapterFactory;", "Lcom/robinhood/shared/security/lib/workflow/WorkflowErrorResponse$Details;", "getJsonAdapterFactory", "()Lcom/squareup/moshi/adapters/PolymorphicJsonAdapterFactory;", "lib-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PolymorphicJsonAdapterFactory<Details> getJsonAdapterFactory() {
            return WorkflowErrorResponse.jsonAdapterFactory;
        }
    }

    static {
        PolymorphicJsonAdapterFactory<Details> polymorphicJsonAdapterFactoryWithDefaultValue = PolymorphicJsonAdapterFactory.m3154of(Details.class, "@type").withDefaultValue(Details.Unknown.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithDefaultValue, "withDefaultValue(...)");
        jsonAdapterFactory = polymorphicJsonAdapterFactoryWithDefaultValue;
    }
}
