package com.robinhood.android.doc.p109ui;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.p109ui.initial.DialogResources;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.p355ui.identi.DocumentRequestSource;
import com.robinhood.models.p355ui.identi.ResidentialAddress;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.models.p355ui.identi.UsAddress;
import com.robinhood.reflect.Classes;
import com.robinhood.shared.documents.lib.docupload.UploadFlowDetails;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.buildconfig.BuildFlavors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: util.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u001a&\u0010\n\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u001a\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u001a&\u0010\f\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0005\u001a\n\u0010\u0012\u001a\u00020\u0011*\u00020\u0001\u001a\u0012\u0010\u0013\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a*\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0016*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00162\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0018\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002\u001a\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0016*\b\u0012\u0004\u0012\u00020\u00170\u0016\u001a\u0010\u0010\u001b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00170\u0016\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0010\u0010\u001c\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00170\u0016\u001a\u0010\u0010\u001d\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00170\u0016\u001a\u0010\u0010\u001e\u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u00170\u0016\u001a\u0010\u0010 \u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00170\u0016\u001a\n\u0010!\u001a\u00020\u0007*\u00020\u0017\u001a\u0010\u0010!\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00170\u0016\u001a\f\u0010\"\u001a\u00020#*\u00020$H\u0000\u001a\f\u0010%\u001a\u00020#*\u00020$H\u0000\u001a\u0014\u0010&\u001a\u00020#*\u00020$2\u0006\u0010'\u001a\u00020(H\u0000\u001a\u0014\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020*2\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006+"}, m3636d2 = {"getDisplayNameTitleCase", "", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "resources", "Landroid/content/res/Resources;", "Lcom/robinhood/models/api/IdDocument$Type;", "forCrypto", "", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getDisplayNameLowercase", "getDescription", "getCapturePhotoTitle", "getBackSideSubtitle", "", "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "getReviewPhotoTitle", "", "toIdDocumentReviewPhotoTitle", "getReviewPhotoSubtitle", "toIdDocumentReviewPhotoSubtitle", "toAlphabeticalOrder", "", "Lcom/robinhood/models/ui/DocumentRequest;", "isEligibleToCombine", "requiredDocumentType", "combineRequests", "isPending", "getType", "isPhotoIdAndSelfie", "source", "Lcom/robinhood/models/ui/identi/DocumentRequestSource;", "hasThankedUser", "isInPersonaClient", "showToastForMockingRequests", "", "Lcom/robinhood/android/common/ui/BaseFragment;", "showToastForMockSubmissionSuccess", "showRejectionDialog", "dialogResources", "Lcom/robinhood/android/doc/ui/initial/DialogResources;", "getFullStateName", "Lcom/robinhood/models/ui/identi/ResidentialAddress;", "feature-doc-upload_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UtilKt {

    /* compiled from: util.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiDocumentRequest.Type.values().length];
            try {
                iArr[ApiDocumentRequest.Type.PHOTO_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiDocumentRequest.Type.PHOTO_ID_WITH_SELFIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiDocumentRequest.Type.VIDEO_SELFIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiDocumentRequest.Type.NATIONAL_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiDocumentRequest.Type.LETTER_407.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiDocumentRequest.Type.BANK_STATEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiDocumentRequest.Type.BROKERAGE_STATEMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiDocumentRequest.Type.UTILITY_BILL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiDocumentRequest.Type.SIGNED_CUSTOMER_DOCUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiDocumentRequest.Type.NAME_CHANGE_LEGAL_DOCUMENTS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiDocumentRequest.Type.PERMANENT_RESIDENT_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiDocumentRequest.Type.THIRD_PARTY_WIRE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiDocumentRequest.Type.THREE_POINT_SELFIE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiDocumentRequest.Type.FOREIGN_PASSPORT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApiDocumentRequest.Type.FOREIGN_BANK_STATEMENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApiDocumentRequest.Type.WIRE_REQUEST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApiDocumentRequest.Type.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IdDocument.Type.values().length];
            try {
                iArr2[IdDocument.Type.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[IdDocument.Type.DRIVING_LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[IdDocument.Type.ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[IdDocument.Type.NATIONAL_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[IdDocument.Type.LETTER_407.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[IdDocument.Type.BANK_STATEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[IdDocument.Type.BROKERAGE_STATEMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[IdDocument.Type.SIGNED_CUSTOMER_DOCUMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[IdDocument.Type.NAME_CHANGE_LEGAL_DOCUMENTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[IdDocument.Type.PERMANENT_RESIDENT_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[IdDocument.Type.THREE_POINT_SELFIE.ordinal()] = 11;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[IdDocument.Type.FOREIGN_PASSPORT.ordinal()] = 12;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[IdDocument.Type.FOREIGN_BANK_STATEMENT.ordinal()] = 13;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[IdDocument.Type.UTILITY_BILL.ordinal()] = 14;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[IdDocument.Type.THIRD_PARTY_WIRE.ordinal()] = 15;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String getDisplayNameTitleCase(ApiDocumentRequest.Type type2, Resources resources) throws Resources.NotFoundException {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(type2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
            case 2:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_generic_photo_id);
                break;
            case 3:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_video_selfie_case);
                break;
            case 4:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_national_id_title_case);
                break;
            case 5:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_letter_3210_title_case);
                break;
            case 6:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_bank_statement_title_case);
                break;
            case 7:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_brokerage_statement_title_case);
                break;
            case 8:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_utility_bill_title_case);
                break;
            case 9:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_signed_customer_document_title_case);
                break;
            case 10:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_name_change_documents_title_case);
                break;
            case 11:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_permanent_resident_card_title_case);
                break;
            case 12:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_third_party_wire);
                break;
            case 13:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_three_point_selfie_case);
                break;
            case 14:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_foreign_passport_title_case);
                break;
            case 15:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_foreign_bank_statement_title_case);
                break;
            case 16:
                numValueOf = Integer.valueOf(C14254R.string.doc_type_wire_document_title_case);
                break;
            case 17:
                numValueOf = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (numValueOf == null) {
            return "Identity document";
        }
        String string2 = resources.getString(numValueOf.intValue());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static /* synthetic */ String getDisplayNameTitleCase$default(IdDocument.Type type2, Resources resources, boolean z, CountryCode.Supported supported, int i, Object obj) {
        if ((i & 4) != 0) {
            supported = null;
        }
        return getDisplayNameTitleCase(type2, resources, z, supported);
    }

    public static final String getDisplayNameTitleCase(IdDocument.Type type2, Resources resources, boolean z, CountryCode.Supported supported) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(type2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$1[type2.ordinal()]) {
            case 1:
                i = C14254R.string.doc_type_passport_title_case;
                break;
            case 2:
                i = C14254R.string.doc_type_drivers_license_title_case;
                break;
            case 3:
                if (z) {
                    i = C14254R.string.doc_type_state_id_title_case;
                    break;
                } else {
                    i = C14254R.string.doc_type_other_id_title_case;
                    break;
                }
            case 4:
                if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    i = C14254R.string.doc_type_gb_national_id_title_case;
                    break;
                } else {
                    i = C14254R.string.doc_type_national_id_title_case;
                    break;
                }
            case 5:
                i = C14254R.string.doc_type_letter_3210_title_case;
                break;
            case 6:
                i = C14254R.string.doc_type_bank_statement_title_case;
                break;
            case 7:
                i = C14254R.string.doc_type_brokerage_statement_title_case;
                break;
            case 8:
                i = C14254R.string.doc_type_signed_customer_document_title_case;
                break;
            case 9:
                i = C14254R.string.doc_type_name_change_documents_title_case;
                break;
            case 10:
                i = C14254R.string.doc_type_permanent_resident_card_title_case;
                break;
            case 11:
                i = C14254R.string.doc_type_three_point_selfie_case;
                break;
            case 12:
                i = C14254R.string.doc_type_foreign_passport_title_case;
                break;
            case 13:
                i = C14254R.string.doc_type_foreign_bank_statement_title_case;
                break;
            case 14:
                i = C14254R.string.doc_type_utility_bill_title_case;
                break;
            case 15:
                i = C14254R.string.doc_type_third_party_wire;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static /* synthetic */ String getDisplayNameLowercase$default(IdDocument.Type type2, Resources resources, boolean z, CountryCode.Supported supported, int i, Object obj) {
        if ((i & 4) != 0) {
            supported = null;
        }
        return getDisplayNameLowercase(type2, resources, z, supported);
    }

    public static final String getDisplayNameLowercase(IdDocument.Type type2, Resources resources, boolean z, CountryCode.Supported supported) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(type2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$1[type2.ordinal()]) {
            case 1:
                i = C14254R.string.doc_type_passport_lowercase;
                break;
            case 2:
                i = C14254R.string.doc_type_drivers_license_lowercase;
                break;
            case 3:
                if (z) {
                    i = C14254R.string.doc_type_state_id_lowercase;
                    break;
                } else {
                    i = C14254R.string.doc_type_other_id_lowercase;
                    break;
                }
            case 4:
                if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    i = C14254R.string.doc_type_gb_national_id_lowercase;
                    break;
                } else {
                    i = C14254R.string.doc_type_national_id_lowercase;
                    break;
                }
            case 5:
                i = C14254R.string.doc_type_letter_3210_lowercase;
                break;
            case 6:
                i = C14254R.string.doc_type_bank_statement_lowercase;
                break;
            case 7:
                i = C14254R.string.doc_type_brokerage_statement_lowercase;
                break;
            case 8:
                i = C14254R.string.doc_type_signed_customer_document_lowercase;
                break;
            case 9:
                i = C14254R.string.doc_type_name_change_document_lowercase;
                break;
            case 10:
                i = C14254R.string.doc_type_permanent_resident_card_lowercase;
                break;
            case 11:
                i = C14254R.string.doc_type_three_point_selfie_case;
                break;
            case 12:
                i = C14254R.string.doc_type_foreign_passport_lowercase;
                break;
            case 13:
                i = C14254R.string.doc_type_foreign_bank_statement_lowercase;
                break;
            case 14:
                i = C14254R.string.doc_type_utility_bill_lowercase;
                break;
            case 15:
                i = C14254R.string.doc_type_wire_document_title_case;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getDescription(IdDocument.Type type2, Resources resources, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(type2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i2 = WhenMappings.$EnumSwitchMapping$1[type2.ordinal()];
        if (i2 == 1) {
            i = C14254R.string.doc_type_passport_description;
        } else if (i2 == 2) {
            i = C14254R.string.doc_type_drivers_license_description;
        } else {
            if (i2 != 3 || z) {
                return null;
            }
            i = C14254R.string.doc_type_other_id_description;
        }
        return resources.getString(i);
    }

    public static /* synthetic */ String getCapturePhotoTitle$default(IdDocument.Type type2, Resources resources, boolean z, CountryCode.Supported supported, int i, Object obj) {
        if ((i & 4) != 0) {
            supported = null;
        }
        return getCapturePhotoTitle(type2, resources, z, supported);
    }

    public static final String getCapturePhotoTitle(IdDocument.Type type2, Resources resources, boolean z, CountryCode.Supported supported) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String displayNameLowercase = getDisplayNameLowercase(type2, resources, z, supported);
        switch (WhenMappings.$EnumSwitchMapping$1[type2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
                String string2 = resources.getString(C14254R.string.doc_upload_capture_photo_title_your, displayNameLowercase);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 5:
            case 8:
                String string3 = resources.getString(C14254R.string.doc_upload_capture_photo_title, displayNameLowercase);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 11:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(type2);
                throw new ExceptionsH();
            case 15:
                String string4 = resources.getString(C14254R.string.doc_type_third_party_wire);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final CharSequence getBackSideSubtitle(UploadFlowDetails uploadFlowDetails, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uploadFlowDetails, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C14254R.string.doc_upload_capture_photo_back, getDisplayNameLowercase$default(uploadFlowDetails.getDocumentType(), resources, uploadFlowDetails.getForCrypto(), null, 4, null));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return HtmlCompat.fromHtml$default(string2, 0, 2, null);
    }

    public static final int getReviewPhotoTitle(IdDocument.Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[type2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return C14254R.string.doc_upload_review_bank_statement_pdf_title;
            case 9:
                return C14254R.string.doc_upload_review_generic_doc_title;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int toIdDocumentReviewPhotoTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer numValueOf = null;
        try {
            IdDocument.Type type2 = (IdDocument.Type) IdDocument.Type.INSTANCE.fromServerValue(str);
            if (type2 != null) {
                numValueOf = Integer.valueOf(getReviewPhotoTitle(type2));
            }
        } catch (EnumConstantNotPresentException unused) {
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return C14254R.string.doc_upload_review_bank_statement_pdf_title;
    }

    public static final String getReviewPhotoSubtitle(IdDocument.Type type2, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$1[type2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 8:
            case 10:
            case 12:
            case 14:
            case 15:
                String string2 = resources.getString(C14254R.string.doc_upload_review_default_subtitle);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 5:
                String string3 = resources.getString(C14254R.string.doc_upload_review_407_subtitle);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 6:
            case 13:
                String string4 = resources.getString(C14254R.string.doc_upload_review_bank_statement_subtitle);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 7:
                String string5 = resources.getString(C14254R.string.doc_upload_review_brokerage_statement_subtitle);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 9:
                String string6 = resources.getString(C14254R.string.doc_upload_review_name_change_documents_subtitle);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 11:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(type2);
                throw new ExceptionsH();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String toIdDocumentReviewPhotoSubtitle(String str, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String reviewPhotoSubtitle = null;
        try {
            IdDocument.Type type2 = (IdDocument.Type) IdDocument.Type.INSTANCE.fromServerValue(str);
            if (type2 != null) {
                reviewPhotoSubtitle = getReviewPhotoSubtitle(type2, resources);
            }
        } catch (EnumConstantNotPresentException | IllegalStateException unused) {
        }
        if (reviewPhotoSubtitle != null) {
            return reviewPhotoSubtitle;
        }
        String string2 = resources.getString(C14254R.string.doc_upload_review_default_subtitle);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final List<List<DocumentRequest>> toAlphabeticalOrder(List<? extends List<DocumentRequest>> list, final Resources resources) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return CollectionsKt.sortedWith(list, new Comparator() { // from class: com.robinhood.android.doc.ui.UtilKt$toAlphabeticalOrder$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(UtilKt.getDisplayNameTitleCase((List<DocumentRequest>) t, resources), UtilKt.getDisplayNameTitleCase((List<DocumentRequest>) t2, resources));
            }
        });
    }

    public static final boolean isEligibleToCombine(DocumentRequest documentRequest, ApiDocumentRequest.Type requiredDocumentType) {
        Intrinsics.checkNotNullParameter(documentRequest, "<this>");
        Intrinsics.checkNotNullParameter(requiredDocumentType, "requiredDocumentType");
        return !documentRequest.getForCrypto() && documentRequest.getType() == requiredDocumentType && documentRequest.getState() == ApiDocumentRequest.State.PENDING_UPLOAD;
    }

    public static final List<List<DocumentRequest>> combineRequests(List<DocumentRequest> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<DocumentRequest> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((DocumentRequest) obj).getType() == ApiDocumentRequest.Type.VIDEO_SELFIE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(CollectionsKt.listOf((DocumentRequest) it.next()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (isEligibleToCombine((DocumentRequest) obj2, ApiDocumentRequest.Type.PHOTO_ID)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list2) {
            if (isEligibleToCombine((DocumentRequest) obj3, ApiDocumentRequest.Type.THREE_POINT_SELFIE)) {
                arrayList4.add(obj3);
            }
        }
        Iterator it2 = arrayList3.iterator();
        Iterator it3 = arrayList4.iterator();
        ArrayList arrayList5 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(arrayList3, 10), CollectionsKt.collectionSizeOrDefault(arrayList4, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            arrayList5.add(CollectionsKt.listOf((Object[]) new DocumentRequest[]{(DocumentRequest) it2.next(), (DocumentRequest) it3.next()}));
        }
        List listSubList = arrayList3.subList(arrayList5.size(), arrayList3.size());
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        Iterator it4 = listSubList.iterator();
        while (it4.hasNext()) {
            arrayList6.add(CollectionsKt.listOf((DocumentRequest) it4.next()));
        }
        List listSubList2 = arrayList4.subList(arrayList5.size(), arrayList4.size());
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList2, 10));
        Iterator it5 = listSubList2.iterator();
        while (it5.hasNext()) {
            arrayList7.add(CollectionsKt.listOf((DocumentRequest) it5.next()));
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj4 : list2) {
            DocumentRequest documentRequest = (DocumentRequest) obj4;
            if (!isEligibleToCombine(documentRequest, ApiDocumentRequest.Type.PHOTO_ID) && !isEligibleToCombine(documentRequest, ApiDocumentRequest.Type.THREE_POINT_SELFIE) && documentRequest.getType() != ApiDocumentRequest.Type.VIDEO_SELFIE) {
                arrayList8.add(obj4);
            }
        }
        ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            arrayList9.add(CollectionsKt.listOf((DocumentRequest) it6.next()));
        }
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList5), (Iterable) arrayList6), (Iterable) arrayList7), (Iterable) arrayList9);
    }

    public static final boolean isPending(List<DocumentRequest> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<DocumentRequest> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((DocumentRequest) it.next()).isPending()) {
                return true;
            }
        }
        return false;
    }

    public static final String getDisplayNameTitleCase(List<DocumentRequest> list, final Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (!isPhotoIdAndSelfie(list)) {
            return list.size() == 1 ? getDisplayNameTitleCase(((DocumentRequest) CollectionsKt.first((List) list)).getType(), resources) : CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: com.robinhood.android.doc.ui.UtilKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UtilKt.getDisplayNameTitleCase$lambda$11(resources, (DocumentRequest) obj);
                }
            }, 30, null);
        }
        String string2 = resources.getString(C14254R.string.doc_type_photo_id_and_selfie);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getDisplayNameTitleCase$lambda$11(Resources resources, DocumentRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return getDisplayNameTitleCase(it.getType(), resources);
    }

    public static final String getType(List<DocumentRequest> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return isPhotoIdAndSelfie(list) ? "photo_id_and_selfie_separate" : list.size() == 1 ? ((DocumentRequest) CollectionsKt.first((List) list)).getType().getServerValue() : CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: com.robinhood.android.doc.ui.UtilKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UtilKt.getType$lambda$12((DocumentRequest) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getType$lambda$12(DocumentRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getType().getServerValue();
    }

    public static final boolean isPhotoIdAndSelfie(List<DocumentRequest> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<DocumentRequest> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((DocumentRequest) it.next()).getType());
        }
        return Intrinsics.areEqual(arrayList, CollectionsKt.listOf((Object[]) new ApiDocumentRequest.Type[]{ApiDocumentRequest.Type.PHOTO_ID, ApiDocumentRequest.Type.THREE_POINT_SELFIE}));
    }

    public static final DocumentRequestSource source(List<DocumentRequest> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<DocumentRequest> list2 = list;
        boolean z = list2 instanceof Collection;
        if (!z || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                DocumentRequestSource source = ((DocumentRequest) it.next()).getSource();
                DocumentRequestSource documentRequestSource = DocumentRequestSource.UAR;
                if (source == documentRequestSource) {
                    return documentRequestSource;
                }
            }
        }
        if (!z || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                DocumentRequestSource source2 = ((DocumentRequest) it2.next()).getSource();
                DocumentRequestSource documentRequestSource2 = DocumentRequestSource.ONBOARDING;
                if (source2 == documentRequestSource2) {
                    return documentRequestSource2;
                }
            }
        }
        return DocumentRequestSource.OTHER;
    }

    public static final boolean hasThankedUser(List<DocumentRequest> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (isInPersonaClient(list)) {
            return true;
        }
        DocumentRequest documentRequest = (DocumentRequest) CollectionsKt.lastOrNull((List) list);
        return (documentRequest != null ? documentRequest.getType() : null) == ApiDocumentRequest.Type.THREE_POINT_SELFIE;
    }

    public static final boolean isInPersonaClient(DocumentRequest documentRequest) {
        Intrinsics.checkNotNullParameter(documentRequest, "<this>");
        if (!BuildFlavors.INSTANCE.isDebugOrInternal() || Classes.INSTANCE.forNameOrNull("androidx.test.espresso.Espresso", Object.class) == null) {
            return documentRequest.getType() == ApiDocumentRequest.Type.PHOTO_ID || documentRequest.getType() == ApiDocumentRequest.Type.THREE_POINT_SELFIE;
        }
        return false;
    }

    public static final boolean isInPersonaClient(List<DocumentRequest> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() > 1 && !isPhotoIdAndSelfie(list)) {
            return false;
        }
        List<DocumentRequest> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (isInPersonaClient((DocumentRequest) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final void showToastForMockingRequests(BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Toast.makeText(baseFragment.requireContext(), "Looks like you are mocking doc requests, interactions with backend such as document submission for such doc requests will not work. If this is not the case, please report it to our backend.", 1).show();
    }

    public static final void showToastForMockSubmissionSuccess(BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Toast.makeText(baseFragment.requireContext(), "Looks like you are mocking doc requests, so submission failure will be mocked as success to bypass.", 1).show();
    }

    public static final void showRejectionDialog(BaseFragment baseFragment, DialogResources dialogResources) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(dialogResources, "dialogResources");
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = baseFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder builderCreate = companion.create(contextRequireContext);
        builderCreate.setId(dialogResources.getId());
        builderCreate.setTitle(dialogResources.getTitle(), new Object[0]);
        builderCreate.setMessage(dialogResources.getMessage(), new Object[0]);
        Integer drawableRes = dialogResources.getDrawableRes();
        if (drawableRes != null) {
            builderCreate.setImage(drawableRes.intValue());
        }
        if (dialogResources.getShowUpdateAppAction()) {
            builderCreate.setPositiveButton(C14254R.string.doc_upload_dialog_update_required_action, new Object[0]);
            builderCreate.setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
        }
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(builderCreate, childFragmentManager, dialogResources.getTag(), false, 4, null);
    }

    public static final String getFullStateName(ResidentialAddress residentialAddress, Resources resources) throws Resources.NotFoundException {
        String state;
        Intrinsics.checkNotNullParameter(residentialAddress, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        UiAddress address = residentialAddress.getAddress();
        UsAddress usAddress = address instanceof UsAddress ? (UsAddress) address : null;
        if (usAddress == null || (state = usAddress.getState()) == null) {
            return null;
        }
        String[] stringArray = resources.getStringArray(C11048R.array.us_states);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String[] stringArray2 = resources.getStringArray(C11048R.array.us_states_full_name);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = state.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        int length = stringArray.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.areEqual(stringArray[i], upperCase)) {
                return stringArray2[i];
            }
        }
        return state;
    }
}
