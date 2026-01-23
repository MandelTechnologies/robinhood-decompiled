package com.robinhood.android.psp;

import android.content.Context;
import android.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import com.robinhood.compose.bento.component.cards.SecondaryRow;
import com.robinhood.models.api.bonfire.ApiPspEnrollmentCardViewModel;
import com.robinhood.models.api.bonfire.ApiPspEnrollmentCustomThemedColorPalette;
import com.robinhood.models.api.bonfire.ApiPspEnrollmentResponse;
import com.robinhood.models.api.bonfire.ApiPspEnrollmentViewModel;
import com.robinhood.models.serverdriven.api.ApiGenericButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: ProgramEnrollmentCelebrationViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationViewState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationViewState$Loaded;", "Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationViewState$Loading;", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class ProgramEnrollmentCelebrationViewState {
    public static final int $stable = 0;

    public /* synthetic */ ProgramEnrollmentCelebrationViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProgramEnrollmentCelebrationViewState() {
    }

    /* compiled from: ProgramEnrollmentCelebrationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationViewState$Loading;", "Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationViewState;", "<init>", "()V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends ProgramEnrollmentCelebrationViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: ProgramEnrollmentCelebrationViewState.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020/2\u0006\u00100\u001a\u000201J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0013\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020&HÖ\u0001J\t\u0010:\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0013\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationViewState$Loaded;", "Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationViewState;", "enrollmentResponse", "Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;)V", "getEnrollmentResponse", "()Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;", "viewModel", "Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentViewModel;", "palette", "Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentCustomThemedColorPalette;", "cardViewModel", "Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentCardViewModel;", "cardBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "getCardBackgroundColor-0d7_KjU", "()J", "J", "colorOnPrimary", "getColorOnPrimary-0d7_KjU", "cardEyebrow", "", "getCardEyebrow", "()Ljava/lang/String;", "cardTitle", "getCardTitle", "cardPrimaryText", "getCardPrimaryText", "cardMetadataPrimaryText", "getCardMetadataPrimaryText", "description", "getDescription", "secondaryRow", "Lcom/robinhood/compose/bento/component/cards/SecondaryRow;", "getSecondaryRow", "()Lcom/robinhood/compose/bento/component/cards/SecondaryRow;", "backgroundColor", "", "getBackgroundColor", "()I", "footerButtons", "", "Lcom/robinhood/android/psp/ButtonWithColor;", "getFooterButtons", "()Ljava/util/List;", "partnerLogoUrl", "Lokhttp3/HttpUrl;", "context", "Landroid/content/Context;", "rhLogoUrl", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Loaded extends ProgramEnrollmentCelebrationViewState {
        public static final int $stable = 8;
        private final long cardBackgroundColor;
        private final ApiPspEnrollmentCardViewModel cardViewModel;
        private final long colorOnPrimary;
        private final ApiPspEnrollmentResponse enrollmentResponse;
        private final ApiPspEnrollmentCustomThemedColorPalette palette;
        private final ApiPspEnrollmentViewModel viewModel;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiPspEnrollmentResponse apiPspEnrollmentResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                apiPspEnrollmentResponse = loaded.enrollmentResponse;
            }
            return loaded.copy(apiPspEnrollmentResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiPspEnrollmentResponse getEnrollmentResponse() {
            return this.enrollmentResponse;
        }

        public final Loaded copy(ApiPspEnrollmentResponse enrollmentResponse) {
            Intrinsics.checkNotNullParameter(enrollmentResponse, "enrollmentResponse");
            return new Loaded(enrollmentResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.enrollmentResponse, ((Loaded) other).enrollmentResponse);
        }

        public int hashCode() {
            return this.enrollmentResponse.hashCode();
        }

        public String toString() {
            return "Loaded(enrollmentResponse=" + this.enrollmentResponse + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(ApiPspEnrollmentResponse enrollmentResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(enrollmentResponse, "enrollmentResponse");
            this.enrollmentResponse = enrollmentResponse;
            ApiPspEnrollmentViewModel view_model = enrollmentResponse.getView_model();
            this.viewModel = view_model;
            ApiPspEnrollmentCustomThemedColorPalette color_palette = view_model.getColor_palette();
            this.palette = color_palette;
            this.cardViewModel = view_model.getCard_view_model();
            this.cardBackgroundColor = Color2.Color(Color.parseColor(color_palette.getBackground_secondary_color()));
            this.colorOnPrimary = Color2.Color(Color.parseColor(color_palette.getForeground_color()));
        }

        public final ApiPspEnrollmentResponse getEnrollmentResponse() {
            return this.enrollmentResponse;
        }

        /* renamed from: getCardBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
        public final long getCardBackgroundColor() {
            return this.cardBackgroundColor;
        }

        /* renamed from: getColorOnPrimary-0d7_KjU, reason: not valid java name and from getter */
        public final long getColorOnPrimary() {
            return this.colorOnPrimary;
        }

        public final String getCardEyebrow() {
            return this.cardViewModel.getBody_row().getEyebrow();
        }

        public final String getCardTitle() {
            return this.cardViewModel.getBody_row().getTitle();
        }

        public final String getCardPrimaryText() {
            return this.cardViewModel.getFooter_row().getPrimary_label();
        }

        public final String getCardMetadataPrimaryText() {
            return this.cardViewModel.getFooter_row().getMetadata();
        }

        public final String getDescription() {
            return this.cardViewModel.getBody_row().getSubtitle();
        }

        public final SecondaryRow getSecondaryRow() {
            return new SecondaryRow(this.cardViewModel.getFooter_row().getSecondary_label(), this.cardViewModel.getFooter_row().getSecondary_metadata());
        }

        public final int getBackgroundColor() {
            return Color.parseColor(this.palette.getBackground_color());
        }

        public final List<ButtonWithColor> getFooterButtons() {
            List<ApiGenericButton> footer_buttons = this.viewModel.getFooter_buttons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(footer_buttons, 10));
            Iterator<T> it = footer_buttons.iterator();
            while (it.hasNext()) {
                arrayList.add(new ButtonWithColor(((ApiGenericButton) it.next()).toDbModel(), Color.parseColor(this.palette.getBackground_color())));
            }
            return arrayList;
        }

        public final HttpUrl partnerLogoUrl(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return this.cardViewModel.getHeader_row().getHeader_partner_logo().getLight().toDbModel().toImageUrl(context);
        }

        public final HttpUrl rhLogoUrl(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return this.cardViewModel.getHeader_row().getHeader_rh_logo().getLight().toDbModel().toImageUrl(context);
        }
    }
}
