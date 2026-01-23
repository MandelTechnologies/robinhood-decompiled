package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.utils.extensions.ResourceTypes;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoValuePropRow.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;", "", "Icon", "Number", "Checkmark", "Pog", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Checkmark;", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Icon;", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Number;", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Pog;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.rows.BentoValuePropRowBulletType, reason: use source file name */
/* loaded from: classes15.dex */
public interface BentoValuePropRow2 {

    /* compiled from: BentoValuePropRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Icon;", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.rows.BentoValuePropRowBulletType$Icon */
    public static final class Icon implements BentoValuePropRow2 {
        public static final int $stable = 0;
        private final ServerToBentoAssetMapper2 asset;
        private final Color color;

        public /* synthetic */ Icon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, DefaultConstructorMarker defaultConstructorMarker) {
            this(serverToBentoAssetMapper2, color);
        }

        private Icon(ServerToBentoAssetMapper2 asset, Color color) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.asset = asset;
            this.color = color;
        }

        public /* synthetic */ Icon(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(serverToBentoAssetMapper2, (i & 2) != 0 ? null : color, null);
        }

        public final ServerToBentoAssetMapper2 getAsset() {
            return this.asset;
        }

        /* renamed from: getColor-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getColor() {
            return this.color;
        }
    }

    /* compiled from: BentoValuePropRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Number;", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;", InquiryField.FloatField.TYPE2, "", "<init>", "(I)V", "getNumber", "()I", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.rows.BentoValuePropRowBulletType$Number */
    public static final class Number implements BentoValuePropRow2 {
        public static final int $stable = 0;
        private final int number;

        public Number(int i) {
            this.number = i;
        }

        public final int getNumber() {
            return this.number;
        }
    }

    /* compiled from: BentoValuePropRow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Checkmark;", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;", "<init>", "()V", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.rows.BentoValuePropRowBulletType$Checkmark */
    public static final class Checkmark implements BentoValuePropRow2 {
        public static final int $stable = 0;
        public static final Checkmark INSTANCE = new Checkmark();

        private Checkmark() {
        }
    }

    /* compiled from: BentoValuePropRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType$Pog;", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;", "asset", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;)V", "getAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.rows.BentoValuePropRowBulletType$Pog */
    public static final class Pog implements BentoValuePropRow2 {
        public static final int $stable = 0;
        private final ServerToBentoAssetMapper3 asset;

        public Pog(ServerToBentoAssetMapper3 asset) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.asset = asset;
        }

        public final ServerToBentoAssetMapper3 getAsset() {
            return this.asset;
        }
    }
}
