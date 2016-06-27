package fossilsarcheology.client.model.prehistoric;

import fossilsarcheology.server.entity.EntityPrehistoric;
import fossilsarcheology.server.entity.mob.EntityAllosaurus;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAllosaurus extends ModelPrehistoric {
	public AdvancedModelRenderer rightUpperLeg;
	public AdvancedModelRenderer leftUpperLeg;
	public AdvancedModelRenderer lowerBody;
	public AdvancedModelRenderer rightLowerLeg;
	public AdvancedModelRenderer rightFoot;
	public AdvancedModelRenderer leftLowerLeg;
	public AdvancedModelRenderer leftFoot;
	public AdvancedModelRenderer tail1;
	public AdvancedModelRenderer upperBody;
	public AdvancedModelRenderer tail2;
	public AdvancedModelRenderer tail3;
	public AdvancedModelRenderer neck;
	public AdvancedModelRenderer leftUpperArm;
	public AdvancedModelRenderer rightUpperArm;
	public AdvancedModelRenderer head;
	public AdvancedModelRenderer headPivot;
	public AdvancedModelRenderer rightCrest;
	public AdvancedModelRenderer leftCrest;
	public AdvancedModelRenderer lowerJaw;
	public AdvancedModelRenderer upperJaw;
	public AdvancedModelRenderer teeth;
	public AdvancedModelRenderer rightLowerArm;
	public AdvancedModelRenderer leftLowerArm;
	private ModelAnimator animator;

	public ModelAllosaurus() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.rightCrest = new AdvancedModelRenderer(this, 100, 0);
		this.rightCrest.mirror = true;
		this.rightCrest.setRotationPoint(-1.5F, -3.0F, -2.0F);
		this.rightCrest.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
		ModelUtils.setRotateAngle(rightCrest, -0.6981316804885863F, 0.0F, -0.3141592741012573F);
		this.teeth = new AdvancedModelRenderer(this, 80, 10);
		this.teeth.mirror = true;
		this.teeth.setRotationPoint(0.0F, 4.5F, 0.0F);
		this.teeth.addBox(-1.5F, -0.5F, -5.0F, 3, 1, 5, 0.0F);
		this.tail3 = new AdvancedModelRenderer(this, 19, 48);
		this.tail3.mirror = true;
		this.tail3.setRotationPoint(0.0F, -0.20000000298023224F, 9.0F);
		this.tail3.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 10, 0.0F);
		this.neck = new AdvancedModelRenderer(this, 100, 18);
		this.neck.mirror = true;
		this.neck.setRotationPoint(0.0F, 2.7F, -5.6F);
		this.neck.addBox(-1.5F, -2.5F, -8.0F, 3, 5, 8, 0.0F);
		ModelUtils.setRotateAngle(neck, -0.5585053606381855F, 0.0F, 0.0F);
		this.lowerBody = new AdvancedModelRenderer(this, 96, 41);
		this.lowerBody.mirror = true;
		this.lowerBody.setRotationPoint(0.0F, 8.3F, 0.0F);
		this.lowerBody.addBox(-3.5F, 0.0F, 0.0F, 7, 8, 7, 0.0F);
		ModelUtils.setRotateAngle(lowerBody, -0.03490658503988659F, 0.0F, 0.0F);
		this.leftFoot = new AdvancedModelRenderer(this, 50, 23);
		this.leftFoot.mirror = true;
		this.leftFoot.setRotationPoint(0.0F, 6.0F, 0.0F);
		this.leftFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
		ModelUtils.setRotateAngle(leftFoot, 0.3141592741012573F, 0.0F, 0.0F);
		this.upperBody = new AdvancedModelRenderer(this, 75, 28);
		this.upperBody.mirror = true;
		this.upperBody.setRotationPoint(0.0F, 0.5F, 0.0F);
		this.upperBody.addBox(-2.5F, 0.0F, -7.0F, 5, 7, 7, 0.0F);
		ModelUtils.setRotateAngle(upperBody, 0.05235987755982988F, 0.0F, 0.0F);
		this.leftUpperArm = new AdvancedModelRenderer(this, 10, 9);
		this.leftUpperArm.mirror = true;
		this.leftUpperArm.setRotationPoint(2.5F, 2.5F, -5.5F);
		this.leftUpperArm.addBox(0.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		ModelUtils.setRotateAngle(leftUpperArm, 0.16110743555066584F, 0.0F, 0.0F);
		this.rightUpperLeg = new AdvancedModelRenderer(this, 8, 26);
		this.rightUpperLeg.setRotationPoint(-3.0F, 12.3F, 5.5F);
		this.rightUpperLeg.addBox(-3.0F, 0.0F, -2.5F, 3, 6, 5, 0.0F);
		this.tail1 = new AdvancedModelRenderer(this, 67, 46);
		this.tail1.mirror = true;
		this.tail1.setRotationPoint(0.0F, 3.2F, 6.0F);
		this.tail1.addBox(-2.5F, -3.0F, 0.0F, 5, 6, 6, 0.0F);
		this.leftCrest = new AdvancedModelRenderer(this, 100, 0);
		this.leftCrest.mirror = true;
		this.leftCrest.setRotationPoint(1.5F, -3.0F, -2.0F);
		this.leftCrest.addBox(-0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
		ModelUtils.setRotateAngle(leftCrest, -0.6981316804885863F, 0.0F, 0.3141592741012573F);
		this.head = new AdvancedModelRenderer(this, 100, 6);
		this.head.mirror = true;
		this.head.setRotationPoint(0.0F, -0.0F, -0.0F);
		this.head.addBox(-2.0F, -3.0F, -4.0F, 4, 6, 4, 0.0F);
		ModelUtils.setRotateAngle(head, 0F, 0.0F, 0.0F);
		this.headPivot = new AdvancedModelRenderer(this, 0, 0);
		this.headPivot.setRotationPoint(0.0F, -0.5F, -6.1F);
		ModelUtils.setRotateAngle(headPivot, 0.8377580409572781F, 0.0F, 0.0F);
		this.lowerJaw = new AdvancedModelRenderer(this, 80, 17);
		this.lowerJaw.mirror = true;
		this.lowerJaw.setRotationPoint(0.0F, 2.0F, -3.2F);
		this.lowerJaw.addBox(-1.0F, -0.8F, -5.6F, 2, 2, 5, 0.0F);
		ModelUtils.setRotateAngle(lowerJaw, -0.06430079482153023F, 0.0F, 0.0F);
		this.leftLowerArm = new AdvancedModelRenderer(this, 20, 8);
		this.leftLowerArm.mirror = true;
		this.leftLowerArm.setRotationPoint(-1.0F, 2.9F, -0.3F);
		this.leftLowerArm.addBox(-0.9F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
		ModelUtils.setRotateAngle(leftLowerArm, -0.6981317007977318F, 0.0F, 0.0F);
		this.rightLowerLeg = new AdvancedModelRenderer(this, 35, 26);
		this.rightLowerLeg.mirror = true;
		this.rightLowerLeg.setRotationPoint(-1.4F, 4.0F, 2.5F);
		this.rightLowerLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
		ModelUtils.setRotateAngle(rightLowerLeg, -0.3141592653589793F, 0.0F, 0.0F);
		this.rightFoot = new AdvancedModelRenderer(this, 50, 23);
		this.rightFoot.mirror = true;
		this.rightFoot.setRotationPoint(0.0F, 6.0F, 0.0F);
		this.rightFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
		ModelUtils.setRotateAngle(rightFoot, 0.3141592741012573F, 0.0F, 0.0F);
		this.rightUpperArm = new AdvancedModelRenderer(this, 10, 9);
		this.rightUpperArm.mirror = true;
		this.rightUpperArm.setRotationPoint(-2.5F, 2.5F, -5.5F);
		this.rightUpperArm.addBox(-2.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
		ModelUtils.setRotateAngle(rightUpperArm, 0.16109388995907664F, 0.0F, 0.0F);
		this.upperJaw = new AdvancedModelRenderer(this, 80, 0);
		this.upperJaw.mirror = true;
		this.upperJaw.setRotationPoint(0.0F, -2.799999952316284F, -4.0F);
		this.upperJaw.addBox(-1.5F, 0.0F, -5.0F, 3, 4, 5, 0.0F);
		this.leftUpperLeg = new AdvancedModelRenderer(this, 8, 26);
		this.leftUpperLeg.mirror = true;
		this.leftUpperLeg.setRotationPoint(3.0F, 12.3F, 5.5F);
		this.leftUpperLeg.addBox(0.0F, 0.0F, -2.5F, 3, 6, 5, 0.0F);
		this.leftLowerLeg = new AdvancedModelRenderer(this, 35, 26);
		this.leftLowerLeg.mirror = true;
		this.leftLowerLeg.setRotationPoint(1.4F, 4.0F, 2.5F);
		this.leftLowerLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
		ModelUtils.setRotateAngle(leftLowerLeg, -0.3141592653589793F, 0.0F, 0.0F);
		this.tail2 = new AdvancedModelRenderer(this, 39, 42);
		this.tail2.mirror = true;
		this.tail2.setRotationPoint(0.0F, -0.8F, 6.0F);
		this.tail2.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 9, 0.0F);
		ModelUtils.setRotateAngle(tail2, 0.017453292519943295F, 0.0F, 0.0F);
		this.rightLowerArm = new AdvancedModelRenderer(this, 20, 8);
		this.rightLowerArm.setRotationPoint(1.0F, 2.9F, -0.3F);
		this.rightLowerArm.addBox(-1.1F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
		ModelUtils.setRotateAngle(rightLowerArm, -0.6981317007977318F, 0.0F, 0.0F);
		this.head.addChild(this.rightCrest);
		this.upperJaw.addChild(this.teeth);
		this.tail2.addChild(this.tail3);
		this.upperBody.addChild(this.neck);
		this.leftLowerLeg.addChild(this.leftFoot);
		this.lowerBody.addChild(this.upperBody);
		this.upperBody.addChild(this.leftUpperArm);
		this.lowerBody.addChild(this.tail1);
		this.head.addChild(this.leftCrest);
		this.neck.addChild(this.headPivot);
		this.headPivot.addChild(this.head);
		this.head.addChild(this.lowerJaw);
		this.rightUpperArm.addChild(this.leftLowerArm);
		this.rightUpperLeg.addChild(this.rightLowerLeg);
		this.rightLowerLeg.addChild(this.rightFoot);
		this.upperBody.addChild(this.rightUpperArm);
		this.head.addChild(this.upperJaw);
		this.leftUpperLeg.addChild(this.leftLowerLeg);
		this.tail1.addChild(this.tail2);
		this.leftUpperArm.addChild(this.rightLowerArm);
		this.updateDefaultPose();
		animator = ModelAnimator.create();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
		this.rightUpperLeg.render(f5);
		this.lowerBody.render(f5);
		this.leftUpperLeg.render(f5);
	}

	public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		animator.update(entity);
		blockMovement(f, f1, f2, f3, f4, f5, (Entity) entity);
		this.resetToDefaultPose();
		setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
		animator.setAnimation(EntityPrehistoric.SPEAK_ANIMATION);
        animator.startKeyframe(10);
        ModelUtils.rotate(animator, lowerJaw, 25, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(10);
		animator.setAnimation(EntityAllosaurus.ATTACK_ANIMATION);
		animator.startKeyframe(10);
		ModelUtils.rotate(animator, neck, -31, 0, 0);
		ModelUtils.rotate(animator, head, -40, 0, 0);
		ModelUtils.rotate(animator, lowerJaw, 60, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(5);
		ModelUtils.rotate(animator, neck, 6, 0, 0);
		ModelUtils.rotate(animator, head, -14, 0, 0);
		ModelUtils.rotate(animator, lowerJaw, 50, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(10);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		AdvancedModelRenderer[] tailParts = { this.tail1, this.tail2, this.tail3 };
		AdvancedModelRenderer[] neckParts = { this.neck, this.head };
		AdvancedModelRenderer[] leftArmParts = { this.leftUpperArm, this.leftLowerArm };
		AdvancedModelRenderer[] rightArmParts = { this.rightUpperArm, this.rightLowerArm };
		this.blockMovement(f, f1, f2, f3, f4, f5, entity);
		if(((EntityPrehistoric) entity).isSkeleton()){
			return;
		}
		ModelUtils.faceTargetMod(neck, f3, f4, 0.5F);
		ModelUtils.faceTargetMod(head, f3, f4, 0.5F);

		EntityPrehistoric prehistoric = (EntityPrehistoric) entity;
		{
			float sitProgress = prehistoric.sitProgress;
			sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(2.0D)), 0, 0);
			sitAnimationRotation(rightUpperLeg, sitProgress, -((float) Math.toRadians(28.0D)), 0, 0);
			sitAnimationRotation(tail2, sitProgress, (float) Math.toRadians(5.22D), 0, 0);
			sitAnimationRotation(neck, sitProgress, -((float) Math.toRadians(44.35D)), 0, 0);
			sitAnimationRotation(rightCrest, sitProgress, -((float) Math.toRadians(39.99999883637168D)), 0, -((float) Math.toRadians(18.000000500895634D)));
			sitAnimationRotation(leftFoot, sitProgress, (float) Math.toRadians(90.0D), 0, 0);
			sitAnimationRotation(rightFoot, sitProgress, (float) Math.toRadians(90.0D), 0, 0);
			sitAnimationRotation(lowerJaw, sitProgress, -((float) Math.toRadians(3.6841641626103416D)), 0, 0);
			sitAnimationRotation(leftLowerLeg, sitProgress, -((float) Math.toRadians(60.0D)), 0, 0);
			sitAnimationRotation(tail3, sitProgress, (float) Math.toRadians(7.83D), 0, 0);
			sitAnimationRotation(leftLowerArm, sitProgress, -((float) Math.toRadians(88.0D)), 0, 0);
			sitAnimationRotation(leftCrest, sitProgress, -((float) Math.toRadians(39.99999883637168D)), 0, (float) Math.toRadians(18.000000500895634D));
			sitAnimationRotation(rightLowerLeg, sitProgress, -((float) Math.toRadians(60.0D)), 0, 0);
			sitAnimationRotation(tail1, sitProgress, -((float) Math.toRadians(18.26D)), 0, 0);
			sitAnimationRotation(leftUpperLeg, sitProgress, -((float) Math.toRadians(28.0D)), 0, 0);
			sitAnimationRotation(rightUpperArm, sitProgress, (float) Math.toRadians(9.23D), 0, 0);
			sitAnimationRotation(rightLowerArm, sitProgress, -((float) Math.toRadians(88.0D)), 0, 0);
			sitAnimationRotation(head, sitProgress, (float) Math.toRadians(67.83D), 0, 0);
			sitAnimationPos(lowerBody, sitProgress, 0F, 15.30F - ModelUtils.getDefaultPositionY(lowerBody), 0F);
			sitAnimationPos(rightUpperLeg, sitProgress, 0F, 17.50F - ModelUtils.getDefaultPositionY(rightUpperLeg), 0F);
			sitAnimationPos(leftUpperLeg, sitProgress, 0F, 17.50F - ModelUtils.getDefaultPositionY(leftUpperLeg), 0F);
		}
		{
			float sitProgress = prehistoric.sleepProgress;
			sitAnimationRotation(head, sitProgress, -((float) Math.toRadians(80D)), (float) Math.toRadians(7.83D), -((float) Math.toRadians(7.83D)));
			sitAnimationRotation(rightUpperArm, sitProgress, (float) Math.toRadians(9.23D), 0, 0);
			sitAnimationRotation(neck, sitProgress, (float) Math.toRadians(60D), 0, 0);
			sitAnimationRotation(rightCrest, sitProgress, -((float) Math.toRadians(39.99999883637168D)), 0, -((float) Math.toRadians(18.000000500895634D)));
			sitAnimationRotation(rightFoot, sitProgress, (float) Math.toRadians(90.0D), 0, 0);
			sitAnimationRotation(tail3, sitProgress, (float) Math.toRadians(7.83D), 0, 0);
			sitAnimationRotation(leftFoot, sitProgress, (float) Math.toRadians(90.0D), 0, 0);
			sitAnimationRotation(leftLowerArm, sitProgress, -((float) Math.toRadians(88.0D)), 0, 0);
			sitAnimationRotation(leftCrest, sitProgress, -((float) Math.toRadians(39.99999883637168D)), 0, (float) Math.toRadians(18.000000500895634D));
			sitAnimationRotation(rightLowerLeg, sitProgress, -((float) Math.toRadians(60.0D)), 0, 0);
			sitAnimationRotation(leftUpperLeg, sitProgress, -((float) Math.toRadians(28.0D)), 0, 0);
			sitAnimationRotation(tail2, sitProgress, (float) Math.toRadians(5.22D), -((float) Math.toRadians(5.22D)), 0);
			sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(2.0D)), 0, 0);
			sitAnimationRotation(leftLowerLeg, sitProgress, -((float) Math.toRadians(60.0D)), 0, 0);
			sitAnimationRotation(lowerJaw, sitProgress, -((float) Math.toRadians(3.6841641626103416D)), 0, 0);
			sitAnimationRotation(rightUpperLeg, sitProgress, -((float) Math.toRadians(28.0D)), 0, 0);
			sitAnimationRotation(tail1, sitProgress, -((float) Math.toRadians(18.26D)), -((float) Math.toRadians(13.04D)), 0);
			sitAnimationRotation(upperBody, sitProgress, (float) Math.toRadians(6.0D), (float) Math.toRadians(7.83D), 0);
			sitAnimationRotation(leftUpperArm, sitProgress, (float) Math.toRadians(9.23D), 0, 0);
			sitAnimationRotation(rightLowerArm, sitProgress, -((float) Math.toRadians(88.0D)), 0, 0);
			sitAnimationPos(lowerBody, sitProgress, 0F, 15.30F - ModelUtils.getDefaultPositionY(lowerBody), 0F);
			sitAnimationPos(rightUpperLeg, sitProgress, 0F, 17.50F - ModelUtils.getDefaultPositionY(rightUpperLeg), 0F);
			sitAnimationPos(leftUpperLeg, sitProgress, 0F, 17.50F - ModelUtils.getDefaultPositionY(leftUpperLeg), 0F);

		}
		{
			float sitProgress = ((EntityPrehistoric) (entity)).weakProgress;
			sitAnimationRotationPrev(rightLowerLeg, sitProgress, -((float) Math.toRadians(60.0D)), 0, 0);
			sitAnimationRotationPrev(head, sitProgress, (float) Math.toRadians(5.22D), -((float) Math.toRadians(7.83D)), -((float) Math.toRadians(44.35D)));
			sitAnimationRotationPrev(rightUpperArm, sitProgress, (float) Math.toRadians(9.23D), -((float) Math.toRadians(7.83D)), (float) Math.toRadians(23.48D));
			sitAnimationRotationPrev(leftLowerLeg, sitProgress, -((float) Math.toRadians(60.0D)), 0, 0);
			sitAnimationRotationPrev(neck, sitProgress, (float) Math.toRadians(15.65D), 0, -((float) Math.toRadians(7.83D)));
			sitAnimationRotationPrev(rightFoot, sitProgress, (float) Math.toRadians(90.0D), 0, 0);
			sitAnimationRotationPrev(leftFoot, sitProgress, (float) Math.toRadians(90.0D), 0, 0);
			sitAnimationRotationPrev(tail1, sitProgress, -((float) Math.toRadians(18.26D)), (float) Math.toRadians(4.17D), 0);
			sitAnimationRotationPrev(rightUpperLeg, sitProgress, (float) Math.toRadians(7.83D), (float) Math.toRadians(15.65D), (float) Math.toRadians(36.52D));
			sitAnimationRotationPrev(upperBody, sitProgress, (float) Math.toRadians(3.0D), 0, 0);
			sitAnimationRotationPrev(leftUpperLeg, sitProgress, -((float) Math.toRadians(10.43D)), -((float) Math.toRadians(13.04D)), -((float) Math.toRadians(23.48D)));
			sitAnimationRotationPrev(lowerJaw, sitProgress, (float) Math.toRadians(13.04D), 0, 0);
			sitAnimationRotationPrev(rightCrest, sitProgress, -((float) Math.toRadians(39.99999883637168D)), 0, -((float) Math.toRadians(18.000000500895634D)));
			sitAnimationRotationPrev(leftLowerArm, sitProgress, -((float) Math.toRadians(88.0D)), 0, 0);
			sitAnimationRotationPrev(rightLowerArm, sitProgress, -((float) Math.toRadians(88.0D)), 0, 0);
			sitAnimationRotationPrev(tail3, sitProgress, (float) Math.toRadians(10.43D), -((float) Math.toRadians(18.26D)), (float) Math.toRadians(7.83D));
			sitAnimationRotationPrev(leftUpperArm, sitProgress, (float) Math.toRadians(9.23D), (float) Math.toRadians(13.04D), -((float) Math.toRadians(28.7D)));
			sitAnimationRotationPrev(leftCrest, sitProgress, -((float) Math.toRadians(39.99999883637168D)), 0, (float) Math.toRadians(18.000000500895634D));
			sitAnimationRotationPrev(lowerBody, sitProgress, -((float) Math.toRadians(2.0D)), 0, 0);
			sitAnimationRotationPrev(tail2, sitProgress, (float) Math.toRadians(5.22D), (float) Math.toRadians(20.87D), 0);
			sitAnimationPos(lowerBody, sitProgress, 0F, 15.30F - ModelUtils.getDefaultPositionY(lowerBody), 0F);
			sitAnimationPos(rightUpperLeg, sitProgress, 0F, 17.50F - ModelUtils.getDefaultPositionY(rightUpperLeg), 0F);
			sitAnimationPos(leftUpperLeg, sitProgress, 0F, 17.50F - ModelUtils.getDefaultPositionY(leftUpperLeg), 0F);
		}
		float speed = 0.1F;
		float speed2 = 0.5F;
		float degree = 0.5F;
		this.walk(upperBody, speed, degree * 0.05F, false, 1F, 0F, entity.ticksExisted, 1);
		this.bob(lowerBody, speed, degree * 0.7F, false, entity.ticksExisted, 1);
		this.walk(leftUpperLeg, speed2, 0.6F, false, 0F, 0.4F, f, f1);
		this.walk(leftLowerLeg, speed2, 0.2F, false, 0F, -0.6F, f, f1);
		this.walk(leftFoot, speed2, -0.6F, true, 2.5F, -0.4F, f, f1);
		this.walk(rightUpperLeg, speed2, 0.6F, true, 0F, -0.4F, f, f1);
		this.walk(rightLowerLeg, speed2, 0.2F, true, 0F, 0.6F, f, f1);
		this.walk(rightFoot, speed2, -0.6F, false, 2.5F, 0.4F, f, f1);
		this.chainWave(tailParts, speed, degree * 0.05F, -3, entity.ticksExisted, 1);
		this.chainWave(leftArmParts, speed, degree * 0.15F, -3, entity.ticksExisted, 1);
		this.chainWave(rightArmParts, speed, degree * 0.15F, -3, entity.ticksExisted, 1);
		this.chainSwing(tailParts, speed, degree * 0.15F, -3, entity.ticksExisted, 1);
		this.chainSwing(tailParts, speed2, degree * 0.25F, -3, f, f1);
		this.chainWave(neckParts, speed2, degree * 0.25F, 3, f, f1);
		this.walk(upperBody, speed2, degree * -0.1F, false, 1F, 0.1F, f, f1);
		this.chainWave(neckParts, speed, degree * 0.15F, 3, entity.ticksExisted, 1);
		((EntityPrehistoric) entity).chainBuffer.applyChainSwingBuffer((ModelRenderer[]) tailParts);

	}

}
