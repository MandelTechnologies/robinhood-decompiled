package com.robinhood.android.feature.account.onboarding.managmentstyle;

import accounts.onboarding.proto.p006v1.ManagementStyleRowDto;
import accounts.onboarding.proto.p006v1.ManagementStyleRowLearnMoreBulletDto;
import accounts.onboarding.proto.p006v1.ManagementStyleRowLearnMoreSheetDto;
import com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementTypeSelectionRow;
import com.robinhood.models.api.ManagementType;
import com.robinhood.rosetta.converters.brokerage.ManagementTypes2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ManagementTypeSelectionRow.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"toUiModel", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow$BottomSheet;", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheetDto;", "toSelectionRow", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow;", "Laccounts/onboarding/proto/v1/ManagementStyleRowDto;", "feature-account-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementTypeSelectionRowKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ManagementTypeSelectionRow2 {
    public static final ManagementTypeSelectionRow.BottomSheet toUiModel(ManagementStyleRowLearnMoreSheetDto managementStyleRowLearnMoreSheetDto) {
        Intrinsics.checkNotNullParameter(managementStyleRowLearnMoreSheetDto, "<this>");
        String title = managementStyleRowLearnMoreSheetDto.getTitle();
        String subtitle = managementStyleRowLearnMoreSheetDto.getSubtitle();
        String primary_cta_text = managementStyleRowLearnMoreSheetDto.getPrimary_cta_text();
        String primary_cta_identifier = managementStyleRowLearnMoreSheetDto.getPrimary_cta_identifier();
        String secondary_cta_text = managementStyleRowLearnMoreSheetDto.getSecondary_cta_text();
        String secondary_cta_identifier = managementStyleRowLearnMoreSheetDto.getSecondary_cta_identifier();
        String logging_identifier = managementStyleRowLearnMoreSheetDto.getLogging_identifier();
        String markdown_disclosure = managementStyleRowLearnMoreSheetDto.getMarkdown_disclosure();
        List<ManagementStyleRowLearnMoreBulletDto> bullets = managementStyleRowLearnMoreSheetDto.getBullets();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bullets, 10));
        for (ManagementStyleRowLearnMoreBulletDto managementStyleRowLearnMoreBulletDto : bullets) {
            arrayList.add(new ManagementTypeSelectionRow.ValueProp(managementStyleRowLearnMoreBulletDto.getTitle(), managementStyleRowLearnMoreBulletDto.getSubtitle()));
        }
        return new ManagementTypeSelectionRow.BottomSheet(title, subtitle, primary_cta_text, primary_cta_identifier, secondary_cta_text, secondary_cta_identifier, logging_identifier, markdown_disclosure, extensions2.toPersistentList(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ManagementTypeSelectionRow toSelectionRow(ManagementStyleRowDto managementStyleRowDto) {
        Intrinsics.checkNotNullParameter(managementStyleRowDto, "<this>");
        ManagementType managementType = ManagementTypes2.toManagementType((rosetta.account.ManagementType) managementStyleRowDto.getManagement_type().toProto());
        String promotional_title = managementStyleRowDto.getPromotional_title();
        String title = managementStyleRowDto.getTitle();
        String subtitle = managementStyleRowDto.getSubtitle();
        boolean enabled = managementStyleRowDto.getEnabled();
        String learn_more_cta_text = managementStyleRowDto.getLearn_more_cta_text();
        String identifier = managementStyleRowDto.getIdentifier();
        ManagementStyleRowLearnMoreSheetDto learn_more_sheet = managementStyleRowDto.getLearn_more_sheet();
        if (learn_more_sheet != null) {
            return new ManagementTypeSelectionRow(managementType, promotional_title, title, subtitle, enabled, learn_more_cta_text, toUiModel(learn_more_sheet), identifier);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
