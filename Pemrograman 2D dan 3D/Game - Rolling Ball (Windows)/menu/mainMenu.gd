extends Control

func _ready():
	pass

func _on_btnMulai_pressed():
	get_tree().change_scene("res://environment/Level01.tscn")

func _on_btnKeluar_pressed():
	get_tree().quit()
